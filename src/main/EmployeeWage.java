package main;

public class EmployeeWage {
    public static final int IS_PRESENT = 1;
    public static final int IS_PART_TIME = 2;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;

    public int noOfCompanies = 0;
    public CompanyEmpWage[] companyEmpWageArray;

    public EmployeeWage() {
        companyEmpWageArray = new CompanyEmpWage[10];
    }

    public void addCompanyEmpWage(String company, int empRate, int daysPerMonth, int hoursPerMonth) {
        companyEmpWageArray[noOfCompanies] = new CompanyEmpWage(company, empRate, daysPerMonth, hoursPerMonth);
        noOfCompanies++;
    }

    public void calculateCompanyEmpWage() {
        for (int index = 0; index < noOfCompanies; index++) {
            companyEmpWageArray[index].setTotalEmpWage(empDailyWage(companyEmpWageArray[index]));
            System.out.println(companyEmpWageArray[index]);
        }
    }

    public int empDailyWage(CompanyEmpWage companyEmpWage) {
        int totalWage = 0;
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        while (totalWorkingDays < companyEmpWage.daysPerMonth && totalWorkingHours + 4 < companyEmpWage.hoursPerMonth) {
            switch ((int) (Math.random() * 10) % 3) {
                case IS_PRESENT:
                    totalWage += companyEmpWage.empRate * FULL_DAY_HOUR;
                    totalWorkingDays++;
                    totalWorkingHours += 8;
                    break;
                case IS_PART_TIME:
                    totalWage += companyEmpWage.empRate * PART_TIME_HOUR;
                    totalWorkingDays++;
                    totalWorkingHours += 4;
                    break;

            }
        }
        System.out.println("Days " + totalWorkingDays);
        System.out.println("Hours " + totalWorkingHours);
        return totalWage;
    }
}
