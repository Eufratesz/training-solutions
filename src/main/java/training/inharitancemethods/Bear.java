
package training.inharitancemethods;

public class Bear {

    public static void hunt() {
        System.out.println("A bear is hunting.");
        eat();

    }

    public void speak() {
        System.out.println("A bear roars");
    }

    protected void sleep() {
        System.out.println("A bear is sleeping");
    }

    protected static void eat() {
        System.out.println("A bear is eating.");
    }
}
