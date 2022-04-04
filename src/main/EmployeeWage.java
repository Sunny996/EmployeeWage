package main;

public class EmployeeWage {

    public static final int IS_PRESENT = 1;
    public static final int IS_PART_TIME = 2;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;


    public int empDailyWage(String company, int daysPerMonth, int hoursPerMonth, int empRate) {
        int totalWage = 0;
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        while (totalWorkingDays < daysPerMonth && totalWorkingHours + 4 < hoursPerMonth) {
            switch ((int) (Math.random() * 10) % 3) {
                case IS_PRESENT:
                    totalWage += empRate * FULL_DAY_HOUR;
                    totalWorkingDays++;
                    totalWorkingHours += 8;
                    break;
                case IS_PART_TIME:
                    totalWage += empRate * PART_TIME_HOUR;
                    totalWorkingDays++;
                    totalWorkingHours += 4;
                    break;

            }
        }
        System.out.println("Employee Wage Per Month in 100 hours or 20 days for "+company+" is " + totalWage);
        System.out.println("Days " + totalWorkingDays);
        System.out.println("Hours " + totalWorkingHours);
        return totalWage;

    }
}
