package training.abstractclass;

import training.inheritanceconstructor.Course;

import java.util.ArrayList;
import java.util.List;

public class Trainer extends Human {

    public Trainer(String name, int age, List<Courses> courses) {
        super(name, age);
        this.courses = courses;

    }

    private List<Courses> courses = new ArrayList<>();

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    @Override
    public int getFreeTime() {
        return super.getDefaultFreeTime() - courses.size();
    }

    @Override
    public void work() {
        for (Courses courses : courses) {
            take(courses);
        }
    }
     private void take (Courses courses) {
        //


    }
}
