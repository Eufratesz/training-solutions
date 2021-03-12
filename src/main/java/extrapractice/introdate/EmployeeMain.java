package extrapractice.introdate;

import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Neve: ");
        String name = scanner.nextLine();
        System.out.println("Szül. év: ");
        int year = scanner.nextInt();
        System.out.println("Szül. hónap: ");
        int month = scanner.nextInt();
        System.out.println("Szül. nap: ");
        int day = scanner.nextInt();
        scanner.nextLine();

        Employee employee = new Employee(year, month, day, name);
        System.out.println("A dolgozó neve: " + employee.getName());
        System.out.println("születési ideje: " +employee.getDateOfBirth());
        System.out.println("Belépés ideje: " + employee.getBeginEmployment());

    }
}
