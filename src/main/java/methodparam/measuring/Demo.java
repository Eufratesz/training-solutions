package methodparam.measuring;

import java.util.List;

public class Demo {

    public void createEmployee(String name, int yearOfBirth, EmployeeType employeeType){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Invalid name");
        }
        if (yearOfBirth < 1900 || yearOfBirth > 2019) {
            throw new IllegalArgumentException("Invalid year");
        }
    }
    //Cél: valamit megtalálni a listában + hányadikként?
    public Result findEmployee(String prefix, List<String>names){
        for(int i =0; i < names.size(); i++){
            if(names.get(i).startsWith(prefix)){
                return new Result(names.get(i), i );
            }
        }
        throw new IllegalArgumentException("Cannot find employee");
    }


}
