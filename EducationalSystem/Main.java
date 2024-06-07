package EducationalSystem;

public class Main {
    public static void main(String[] args) {
        EducationSystems system = new EducationSystems();

        OnloneCourse onlineCourse1 = new OnloneCourse("Alice", "Math", 85);
        OfflineCourse offlineCourse1 = new OfflineCourse("Bob", "History", 78);
        OnloneCourse onlineCourse2 = new OnloneCourse("Charlie", "Science", 92);
        OfflineCourse offlineCourse2 = new OfflineCourse("Diana", "Literature", 88);

        system.addCourse(onlineCourse1);
        system.addCourse(offlineCourse1);
        system.addCourse(onlineCourse2);
        system.addCourse(offlineCourse2);

        system.calculateAllGrades();
    }

}
