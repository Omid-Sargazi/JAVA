package EducationalSystem;

public class OnloneCourse extends Course {
    public OnloneCourse(String studentName, String courseName, double score) {
        super(studentName, courseName, score);
    }

    @Override
    public double calculateGrade() {
        return score * 1.1;
    }
}
