package singleResponsibilityPrinciple.example_2;

public class PaidSalary {
    public void paidSalary(Employee employee, EarnSalary earnSalary) {
        System.out.println("Начислено и выплачено: " + earnSalary.earnSalary(new Employee(employee.employeeName, employee.employeePosition, employee.workDays)));
    }
}