package EducationalSystem;

import java.util.ArrayList;
import java.util.List;

public class EducationSystems {
    private List<Course> courses;

    public EducationSystems() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void calculateAllGrades() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }
}
