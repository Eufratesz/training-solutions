package extrapractice.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Capsules {

    List<String>colours = new ArrayList<>();

    public void addLast(String colour){
        colours.add(colour);
    }

    public void addFirst(String colour){
        colours.add(0, colour);
    }

    public void removeFirst(){
        colours.remove(0);
    }

    public void removeLast(){

        colours.remove(colours.size()-1);
    }


    public List<String> getColours(){
        return colours;
    }


    public static void main(String[] args) {
        Capsules capsules = new Capsules();

        capsules.addLast("piros");
        capsules.addLast("kék");
        capsules.addLast("zöld");

        System.out.println(capsules.getColours());

        capsules.removeFirst();
        System.out.println(capsules.getColours());

        capsules.removeLast();
        System.out.println(capsules.getColours());

        capsules.addFirst("fehér");
        capsules.addFirst("fekete");
        System.out.println(capsules.getColours());

        capsules.addLast("narancssárga");
        System.out.println(capsules.getColours());




    }


}
