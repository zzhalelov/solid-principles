package singleResponsibilityPrinciple.example_2;

public class EarnSalary {
    public int earnSalary(Employee employee) {
        int salary = employee.workDays * 10_000;
        System.out.println(salary);
        return salary;
    }
}