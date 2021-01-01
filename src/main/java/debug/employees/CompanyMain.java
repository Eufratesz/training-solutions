package debug.employees;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {

    public static void main(String[] args) {


        Employee firstEmployee = new Employee("John Doe", 1980);
        Employee secondEmployee = new Employee("Jim Smith", 1981);
        Employee thirdEmployee = new Employee("Sarah Jones", 1982);

        Company company = new Company(new ArrayList<>());

        company.addEmployee(firstEmployee);
        company.addEmployee(secondEmployee);
        company.addEmployee(thirdEmployee);


        Employee find = company.findEmployeeByName("Sarah Jones");
        System.out.println(find.getName() + " " + find.getYearOfBirth());


        //System.out.println(company.listEmployeeNames());

        List<String> names = company.listEmployeeNames();
        System.out.println(names);


    }
}
