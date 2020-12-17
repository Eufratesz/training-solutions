package training.inheritanceconstructor;

import java.util.ArrayList;
import java.util.List;

public class Course {
    List<Course> courses = new ArrayList<>();

    public void addCourse(String name) {
        courses.add(new Course());
    }

}
