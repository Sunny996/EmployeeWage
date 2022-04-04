package main;

public class EmployeeWage {
    public final int IS_PRESENT=1;
    public final int IS_ABSENT=0;
    public final int WAGE_PER_HOUR=20;
    public final int FULL_DAY_HOUR=8;
    public final int PART_TIME_HOUR = 4;
    public final int IS_PART_TIME = 2;
    public final int DAYS_PER_MONTH = 20;
    public final int HOURS_PER_MONTH = 100;

    public int empDailyWage() {
        int totalWage = 0;
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        while (totalWorkingDays < DAYS_PER_MONTH && totalWorkingHours + 4 < HOURS_PER_MONTH) {
            switch ((int) (Math.random() * 10) % 3) {
                case IS_PRESENT:
                    totalWage += WAGE_PER_HOUR * FULL_DAY_HOUR;
                    totalWorkingDays++;
                    totalWorkingHours += 8;
                    break;
                case IS_PART_TIME:
                    totalWage += WAGE_PER_HOUR * PART_TIME_HOUR;
                    totalWorkingDays++;
                    totalWorkingHours += 4;
                    break;

            }
        }
        System.out.println("Employee Wage Per Month in 100 hours or 20 days is " + totalWage);
        System.out.println("Days " + totalWorkingDays);
        System.out.println("Hours " + totalWorkingHours);
        return totalWage;

    }
}