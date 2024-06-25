package SOLID.Employee;

public class EmployeePrinter {
    public void printDetails(EmployeeSRP employeeSRP) {
        System.out.println("Employee name: " + employeeSRP.getName());
        System.out.println("Employee Salary: " + employeeSRP.getSalary());
    }
}
