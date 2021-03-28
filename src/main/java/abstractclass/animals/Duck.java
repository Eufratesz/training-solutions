package abstractclass.animals;

public class Duck extends Bird{

    public void move(){
        System.out.println("Waddle");
    }


    public static void main(String[] args) {
        Animal animal = new Duck();
        animal.move();

        Bird bird = new Duck();
        bird.layEggs(5);
        bird.move();
    }
}
