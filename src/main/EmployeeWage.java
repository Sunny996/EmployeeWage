package main;

public class EmployeeWage {
    public final int IS_PRESENT=1;
    public final int IS_ABSENT=0;
    public final int WAGE_PER_HOUR=20;
    public final int FULL_DAY_HOUR=8;
    public final int PART_TIME_HOUR = 4;
    public final int IS_PART_TIME = 2;

    public int empDailyWage(){
        int dailyWage=0;
        int empPresent=(int)(Math.random()*10)%3;
        if(empPresent==IS_PRESENT)
            dailyWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
        else if(empPresent==IS_PART_TIME)
            dailyWage=WAGE_PER_HOUR*PART_TIME_HOUR;
        System.out.println("Daily Wage is "+dailyWage);
        return dailyWage;
    }
}