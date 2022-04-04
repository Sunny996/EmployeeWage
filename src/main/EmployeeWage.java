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
        int empPresentSwitch=(int)(Math.random()*10)%3;
        switch(empPresentSwitch){
            case IS_PRESENT:
                dailyWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
                break;
            case IS_PART_TIME:
                dailyWage=WAGE_PER_HOUR*PART_TIME_HOUR;
                break;

        }
        System.out.println("Daily Wage is "+dailyWage);
        return dailyWage;
    }
}