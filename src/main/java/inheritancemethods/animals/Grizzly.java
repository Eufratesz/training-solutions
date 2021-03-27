package inheritancemethods.animals;

public class Grizzly extends Bear {

    public void speak() {
        System.out.println("Grizzly growls.");
    }

    public void sleep(int length) {
        System.out.println("Grizzly is sleeping for " + length + " hours.");
    }

    public void eat() {
        System.out.println("Grizzly is eating");
    }

    public static void main(String[] args) {
        Grizzly grizzly = new Grizzly();
        grizzly.speak();
        grizzly.hunt();
        grizzly.eat();
        grizzly.sleep();
        grizzly.sleep(10);
    }
}
