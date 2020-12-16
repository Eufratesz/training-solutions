package training.inheritance2constructor;

public class Employee extends Person{
    private int salary;

    public Employee(String name, int age, int salary) {
        super (name, age);
        this.salary = salary;
    }
}
