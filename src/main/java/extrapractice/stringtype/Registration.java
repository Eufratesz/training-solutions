package extrapractice.stringtype;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Felhasználónév: ");
        String username = scanner.nextLine();

        System.out.println("Jelszó: ");
        String password1 = scanner.nextLine();
        System.out.println("Jelszó még egyszer: ");
        String password2 = scanner.nextLine();

        System.out.println("Email cím: ");
        String email = scanner.nextLine();

        UserValidator userValidator = new UserValidator();

        System.out.println(userValidator.isValidUserName(username) ? "A felhasználónév érvényes" : "A felhasználónév érvénytelen");
        System.out.println(userValidator.isValidPassWord(password1, password2) ? "A jelszó érvényes" : "A jelszó érvénytelen");
        System.out.println(userValidator.isValidEmail(email) ? "Az email érvényes" : "Az email érvénytelen");

    }
}
