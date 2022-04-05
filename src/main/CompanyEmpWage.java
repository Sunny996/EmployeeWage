package main;

import java.util.ArrayList;

public class CompanyEmpWage {
    public final int empRate;
    public final int daysPerMonth;
    public final int hoursPerMonth;
    public final String company;
    public int totalEmpWage;
    ArrayList<Integer> dailyWageList=new ArrayList<>();

    public void setDailyWageList(ArrayList<Integer> dailyWageList){
        this.dailyWageList=dailyWageList;
    }


    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    public CompanyEmpWage(String company, int empRate, int daysPerMonth, int hoursPerMonth) {
        this.company = company;
        this.empRate = empRate;
        this.daysPerMonth = daysPerMonth;
        this.hoursPerMonth = hoursPerMonth;
    }
    @Override
    public String toString(){
        return "Total employee wage for "+company+" is "+totalEmpWage;
    }

}
