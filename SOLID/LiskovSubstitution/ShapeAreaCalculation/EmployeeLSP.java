package SOLID.LiskovSubstitution.ShapeAreaCalculation;

abstract class EmployeeLSP {
    public abstract double calculateSalary();
}

class FullTimeEmployeeLSP extends EmployeeLSP {
    private double salary;

    public FullTimeEmployeeLSP(double salary) {
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }
}

class Intern extends EmployeeLSP {
    private double stipend;

    public Intern(double stipend) {
        this.stipend = stipend;
    }

    public double calculateSalary() {
        return stipend;
    }
}
