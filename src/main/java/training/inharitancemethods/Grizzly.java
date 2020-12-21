
package training.inharitancemethods;

public class Grizzly extends Bear{
    public void speak() {
        System.out.println("A grizzly growls.");
    }

    public void sleep(int length) {
        System.out.println("A grizzly is sleeping for " + length + " hours.");
    }

    public static void eat() {
    System.out.println("A grizzly is eating");
    }
/*
    public static void main(String[] args) {
        Grizzly grizzly = new Grizzly();

        grizzly.hunt();
       // grizzly.sleep();
      //  grizzly.sleep(10);
      //  grizzly.speak();
        grizzly.eat();
    }

 */

    public static void main(String[] args) {
        Bear bear = new Grizzly();
        Grizzly grizzly = new Grizzly();
        bear.eat();
        grizzly.eat();
    }
}
