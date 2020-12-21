package training.abstractclass;

import training.inheritanceconstructor.Course;

import java.util.ArrayList;
import java.util.List;


public class Courses {
    List<Course> courses = new ArrayList<>();

    public void addCourse(String name) {
        courses.add(new Course());
    }
}
