package main;

public class EmployeeWageTest {
    public static void main(String[] args) {
        EmployeeWage dMart = new EmployeeWage("Dmart",20, 2, 10);
        dMart.empDailyWage();
        EmployeeWage reliance = new EmployeeWage("Reliance",20, 2, 10);
        reliance.empDailyWage();
    }
}