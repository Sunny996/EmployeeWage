package main;

public class EmployeeWageTest {
    public static void main(String[] args) {
        EmployeeWage employeeWage=new EmployeeWage();
        employeeWage.addCompanyEmpWage("DMart",20,2,10);
        employeeWage.addCompanyEmpWage("Reliance",25,5,20);
        employeeWage.calculateCompanyEmpWage();
    }
}