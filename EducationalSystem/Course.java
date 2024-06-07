package EducationalSystem;

public class Course {
    protected String studentName;
    protected String courseName;
    protected double score;

    public Course(String studentName, String courseName, double score) {
        this.courseName = courseName;
        this.studentName = studentName;
        this.score = score;
    }

    public double calculateGrade() {
        return score;
    }

    @Override
    public String toString() {
        return "Student: " + studentName + ", Course:" + courseName + ",  " + "Grade:  " + score;
    }
}
