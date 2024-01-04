package singleResponsibilityPrinciple.example_2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Secretary", 20);
        Employee employee1 = new Employee("Alex", "CEO", 20);
        FillOutTimesheet fillOutTimesheet = new FillOutTimesheet();
        fillOutTimesheet.fillOutTimesheet(employee);
        fillOutTimesheet.fillOutTimesheet(employee1);
        EarnSalary earnSalary = new EarnSalary();
        PaidSalary paidSalary = new PaidSalary();
        earnSalary.earnSalary(employee);
        paidSalary.paidSalary(employee, earnSalary);
    }
}