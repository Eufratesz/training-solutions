package inheritancemethods.animalsstaticmethods;

public class Bear {

    public static void hunt(){
        System.out.println("Bear is hunting.");
        eat();
    }

    protected static void eat(){
        System.out.println("Bear is eating.");
    }
}
