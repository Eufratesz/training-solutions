package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private List<String> colours = new ArrayList<>();

    public void addLast(String colour) {
        colours.add(colour);
    }

    public void addFirst(String colour) {
        colours.add(0, colour);
    }

    public void removeFirst() {
        colours.remove(0);
    }

    public void removeLast() {
        colours.remove(colours.size()-1);
    }

    public List<String> getColours() {
        return colours;
    }

    public static void main(String[] args) {

       Capsules capsules = new Capsules();
       capsules.addLast("piros");
       capsules.addLast("kék");
       capsules.addLast("zöld");
       capsules.addLast("sárga");
       System.out.println(capsules.getColours());

       capsules.addFirst("barna");
       System.out.println(capsules.getColours());

       capsules.removeLast();
        System.out.println(capsules.getColours());

        capsules.removeFirst();
        System.out.println(capsules.getColours());

        List<String> remaining =capsules.getColours();
        System.out.println(remaining);
        remaining.clear();
        System.out.println(remaining);
        System.out.println(capsules.getColours());  //Igen, a clear metódus hatással volt az eredeti listára.








    }
}
