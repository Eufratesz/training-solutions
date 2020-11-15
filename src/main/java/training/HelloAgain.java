package training;
import java.util.Scanner;

public class HelloAgain {
    public static void main(String[] args) {
        System.out.println("Good morning!");
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Welcome " + name);

        System.out.println("What's your nickname?");
        String nickname = scanner.nextLine();
        System.out.println("Nickname: " + nickname);

        System.out.println("In which city do you live?");
        String city = scanner.nextLine();
        System.out.println("City: " + city);

        System.out.println("What's your address?");
        String address = scanner.nextLine();
        System.out.println("Address: " + address);

        System.out.println("Year of birth?");
        int yearOfBirth = scanner.nextInt();
        System.out.println("Year of birth: " + yearOfBirth);

        System.out.print("Your age is: ");
        int age = 2020 - yearOfBirth;
        System.out.println(age);
        System.out.println("Goodbye!");



    }
}
