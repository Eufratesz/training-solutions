package inheritancemethods.animalsstaticmethods;

public class Grizzly extends Bear{

    public static void eat(){
        System.out.println("Grizzly is eating.");
    }

    public static void main(String[] args) {
        Grizzly grizzly = new Grizzly();
        grizzly.eat();
        grizzly.hunt();
    }
}
