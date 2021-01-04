package training.immutable;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private final String name;
    private final int yearOfBirth;

    private final List<String> courses;

    public Employee(String name, int yearOfBirth, List<String> courses) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public List<String> getCourses(){
        //return courses;
    //    return new ArrayList<>(courses); másolatot ad vissza, így az eredeti lista változatlan maread.
        return List.copyOf(courses);        //UnsopportedOperationException-t dob.
    }
}
