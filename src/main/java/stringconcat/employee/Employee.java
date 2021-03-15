package stringconcat.employee;

public class Employee {

    private String name;
    private String job;
    private int salary;

    public Employee(String name, String job, int salary) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name must be given");
        }
        if(job == null || job.isEmpty()){
            throw new IllegalArgumentException("Job must be given");
        }
        if(salary %1000 != 0){
            throw new IllegalArgumentException("Invalid salary: " + salary);
        }

        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public String toString(){
        return name + " - " + job + " - "  + salary + "Ft";
    }


}
