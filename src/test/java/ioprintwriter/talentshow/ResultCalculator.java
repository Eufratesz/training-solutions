package ioprintwriter.talentshow;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ResultCalculator {

    private List<Vote> votes;
    private List<Production> productions;

    public void readTalents(Path file){
        try(BufferedReader reader = Files.newBufferedReader(file)){
            String line;
            while ((line = reader.readLine()) !=null) {
                String[]temp = line.split(" ");
                Production p = new Production(Long.parseLong(temp[0]), temp[1]);
                productions.add(p);
            }

        }catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }

    public void calculateVotes(Path file){
        try(BufferedReader reader= Files.newBufferedReader(file)){
            String line;
            while( ((line = reader.readLine()) != null)){
                int actVote = Integer.parseInt(line);
                addVote(actVote);
            }

        }catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }

    public void addVote(int id) {
        boolean exist = false;
        for( Vote v : votes) {
            if(v.getId() == id){
                v.incNum();
                exist = true;
            }
        }
        if(!exist) {
            votes.add(new Vote(id, 1));
        }
    }

    public void writeResultToFile(Path file){
        try(PrintWriter pw = new PrintWriter(Files.newBufferedWriter(file))) {
            for(Vote v : votes){
                Production p = findProductionById(v.getId());
                pw.print(v.getId() + " ");
                pw.print(p.getName() + " ");
                pw.print(v.getNumber() + " ");
                pw.println();
            }
            pw.print(("Winner: ") + findWinner().getName());

        }catch (IOException ioe){
            throw new IllegalStateException("Cannot write file", ioe);
        }
    }

    private Production findProductionById(long id){
        for(Production p : productions){
            if(p.getId() == id){
                productions.add(p);
            }
        }
        return null;
    }

    private Production findWinner() {
        int max = votes.get(0).getNumber();
        long maxId = votes.get(0).getId();
        for(Vote v : votes){
            if(v.getNumber()> max) {
                max = v.getNumber();
                maxId = v.getId();
            }
        }
        for (Production p: productions) {
            if(maxId == p.getId()) {
                return p;
            }
        }
        return null;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public List<Production> getProductions() {
        return productions;
    }
}
