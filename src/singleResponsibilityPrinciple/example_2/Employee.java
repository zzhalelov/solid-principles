package singleResponsibilityPrinciple.example_2;

public class Employee {
    String employeeName;
    String employeePosition;
    int workDays;

    public Employee(String employeeName, String employeePosition, int workDays) {
        this.employeeName = employeeName;
        this.employeePosition = employeePosition;
        this.workDays = workDays;
    }
}