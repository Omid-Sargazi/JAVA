package EducationalSystem;

public class OfflineCourse extends Course {
    public OfflineCourse(String studentName, String courseName, double score) {
        super(studentName, courseName, score);
    }

    @Override
    public double calculateGrade() {
        return score * 1.05;
    }
}
