package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your username.");
        String username = scanner.nextLine();

        System.out.println("Type your password.");
        String password1 = scanner.nextLine();

        System.out.println("Type your password again:");
        String password2 = scanner.nextLine();

        System.out.println("Type your e-mail.");
        String email = scanner.nextLine();


//A példányosítás kimaradt. itt elakadtam.
        UserValidator userValidator = new UserValidator();
//A logikai rész ment egyedül, a uservalidator kimaradt.
        System.out.println(userValidator.isValidUsername(username) ? "Valid username" : "Invalid username");
        System.out.println(userValidator.isValidPassword(password1, password2) ? "Valid password" : "Invalid password");
        System.out.println(userValidator.isValidEmail(email) ? "Valid e-mail" : "Invalid e-mail");

            }
}
