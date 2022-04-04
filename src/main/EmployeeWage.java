package main;

public class EmployeeWage {
    public final int IS_PRESENT=1;
    public final int IS_ABSENT=0;
    public final int WAGE_PER_HOUR=20;
    public final int FULL_DAY_HOUR=8;

    public int empDailyWage(){
        int dailyWage=0;
        int empPresent=(int)(Math.random()*10)%2;
        if(empPresent==IS_PRESENT)
            dailyWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
        System.out.println("Daily Wage on a Full Day is "+dailyWage);
        System.out.println(empPresent);
        return dailyWage;
    }
}