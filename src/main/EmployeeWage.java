package main;

import java.util.ArrayList;
import java.util.Arrays;
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
        for( CompanyEmpWage companyEmp: companyEmpWageArray){
            empDailyWage(companyEmp);
        }
    }

    public int empDailyWage(CompanyEmpWage companyEmpWage) {
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage=0;

        while (totalWorkingDays < companyEmpWage.daysPerMonth && totalWorkingHours + 4 < companyEmpWage.hoursPerMonth) {
            switch ((int) (Math.random() * 10) % 3) {
                case IS_PRESENT:
                    totalWage += companyEmpWage.empRate * FULL_DAY_HOUR;
                    companyEmpWage.dailyWageList.add(companyEmpWage.empRate * FULL_DAY_HOUR);
                    totalWorkingDays++;
                    totalWorkingHours += 8;
                    break;
                case IS_PART_TIME:
                    totalWage += companyEmpWage.empRate * PART_TIME_HOUR;
                    companyEmpWage.dailyWageList.add(companyEmpWage.empRate * PART_TIME_HOUR);
                    totalWorkingDays++;
                    totalWorkingHours += 4;
                    break;
            }
        }
        companyEmpWage.setTotalEmpWage(totalWage);
        System.out.println("Days " + totalWorkingDays);
        System.out.println("Hours " + totalWorkingHours);
        System.out.println("Total Wage "+companyEmpWage.totalEmpWage);
        System.out.println(companyEmpWage.dailyWageList);
        return companyEmpWage.totalEmpWage;
    }
}
