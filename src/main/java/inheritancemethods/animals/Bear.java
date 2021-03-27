package inheritancemethods.animals;

public class Bear {
    public void hunt(){
        System.out.print("Bear is hunting.");
        eat();
    }

    protected void eat(){
        System.out.println("Bear is eating.");
    }

    public void speak(){
        System.out.println("Bear roars.");
    }

    protected void sleep(){
        System.out.println("Bear is sleeping.");
    }

    public static void main(String[] args) {
        Bear bear = new Bear();

        bear.hunt();
        bear.speak();
        bear.sleep();
    }
}
