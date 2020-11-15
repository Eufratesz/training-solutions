package classstructureconstructors;
/*
public class TrainerMain {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("John Doe", 1980);

        System.out.println(trainer.getName());
        System.out.println(trainer.getYearOfBirth());

        Trainer anotherTrainer = new Trainer("Jack Doe", 1981);
        System.out.println(anotherTrainer.getName());
        System.out.println(anotherTrainer.getYearOfBirth());
    }
}
*/

// UMl

import java.util.Scanner;

public class TrainerMain{
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Year of Birth?");
        int yearOfBirth = scanner.nextInt();

        Trainer trainer = new Trainer(name, yearOfBirth);

        System.out.println(trainer.getNameAndYearOfBirth());

        System.out.println(name + ", " + "you are " + trainer.getAge() + " years old.");
    }
}