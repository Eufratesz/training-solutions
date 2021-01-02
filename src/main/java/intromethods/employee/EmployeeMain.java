package intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee = new Employee("John Doe", 2010, 300_000);

        System.out.println(employee.getName());
        System.out.println(employee.getHiringYear());
        System.out.println(employee.getSalary());

        employee.setName("Jim Smith");
        employee.raiseSalary(50_000);
        System.out.println(employee.getSalary());
        System.out.println(employee.toString());
    }
}
