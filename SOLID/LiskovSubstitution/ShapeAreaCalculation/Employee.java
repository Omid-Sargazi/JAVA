package SOLID.LiskovSubstitution.ShapeAreaCalculation;

public class Employee {
    public double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(double salary) {
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }
}

class Intern extends Employee {
    public double calculateSalary() {
        throw new UnsupportedOperationException("Interns don't receive a salary");
    }
}