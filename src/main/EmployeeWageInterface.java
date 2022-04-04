package main;

public interface EmployeeWageInterface {
    public static final int IS_PRESENT=1;
    public static final int IS_PART_TIME = 2;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;

    public void addCompanyEmpWage(String company, int empRate, int daysPerMonth, int hoursPerMonth) ;
    public void calculateCompanyEmpWage();
    public int empDailyWage(CompanyEmpWage companyEmpWage);
}
