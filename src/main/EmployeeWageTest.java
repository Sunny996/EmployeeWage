package main;

public class EmployeeWageTest {
    public static void main(String[] args) {
        EmployeeWage dMart=new EmployeeWage("DMart",20,2,10);
        dMart.empDailyWage();
        EmployeeWage reliance=new EmployeeWage("Reliance",25,10,20);
        reliance.empDailyWage();
    }
}