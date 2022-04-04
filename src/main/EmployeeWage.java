package main;

import java.util.ArrayList;
import java.util.List;

public class EmployeeWage implements EmployeeWageInterface {

    public int noOfCompanies = 0;
    public List<CompanyEmpWage> companyEmpWageArray;

    public EmployeeWage() {
        companyEmpWageArray = new ArrayList<>();
    }

    public void addCompanyEmpWage(String company, int empRate, int daysPerMonth, int hoursPerMonth) {
        companyEmpWageArray.add( new CompanyEmpWage(company, empRate, daysPerMonth, hoursPerMonth));
    }

    public void calculateCompanyEmpWage() {
        for (int index = 0; index < noOfCompanies; index++) {
            companyEmpWageArray.get(index).setTotalEmpWage(empDailyWage(companyEmpWageArray.get(index)));
            System.out.println(companyEmpWageArray.get(index));
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
