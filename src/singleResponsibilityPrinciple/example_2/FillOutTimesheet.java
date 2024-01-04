package singleResponsibilityPrinciple.example_2;

public class FillOutTimesheet {
    public void fillOutTimesheet(Employee employee) {
        System.out.println("-----------------------------");
        System.out.println("| " + employee.employeeName + " | " + employee.employeePosition + " | " + employee.workDays);
    }
}