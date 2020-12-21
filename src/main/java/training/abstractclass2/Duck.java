package training.abstractclass2;

public class Duck extends Bird{
    public void move() {
        System.out.println("Waddle");
    }

    public static void main(String[] args) {
        Animal animal= new Duck();
        animal.move();
       // animal.layEggs(5);

        Bird bird = new Duck();
        bird.move();
        bird.layEggs(5);
    }
}
