package extrapractice.interfaces.simplethread;

import java.util.ArrayList;
import java.util.List;

public class SimpleThread implements Runnable{

    private List<String> tasks;

    public SimpleThread(List<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while(!tasks.isEmpty()){
            nextStep();
        }
    }

    private boolean nextStep(){
        if(tasks != null && !tasks.isEmpty()){
            tasks.remove(tasks.size()-1);
            return true;
        }
        return false;
    }

    public List<String> getTasks() {
        return new ArrayList<>(tasks);
    }
}
