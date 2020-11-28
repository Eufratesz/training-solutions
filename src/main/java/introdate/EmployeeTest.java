package introdate;

import java.time.LocalDateTime;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        /*
        Ezt túlbonyolítottam...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dolgozó neve: ");
        String name = scanner.nextLine();
        System.out.println("Dolgozó születési ideje: ");
        int yearOfBirth = scanner.nextInt();
        System.out.println();
        System.out.println("Belépés ideje: ");
        int beginEmployment = scanner.nextInt();
        */
        Employee employee = new Employee(2000,1,1,"Brian Smith");
        System.out.println(employee.getName());
        System.out.println(employee.getDateOfBirth());
        System.out.println(employee.getBeginEmployment());
    }
}
