package main;

public class EmployeeWage {
    public static final int IS_PRESENT = 1;
    public static final int IS_PART_TIME = 2;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;
    public final int empRate;
    public final int daysPerMonth;
    public final int hoursPerMonth;
    public final String company;

    public EmployeeWage(int empRate, int daysPerMonth, int hoursPerMonth) {
        this.company = "DMart";
        this.empRate = empRate;
        this.daysPerMonth = daysPerMonth;
        this.hoursPerMonth = hoursPerMonth;
    }

    public int empDailyWage() {
        int totalWage = 0;
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        while (totalWorkingDays < this.daysPerMonth && totalWorkingHours + 4 < this.hoursPerMonth) {
            switch ((int) (Math.random() * 10) % 3) {
                case IS_PRESENT:
                    totalWage += this.empRate * FULL_DAY_HOUR;
                    totalWorkingDays++;
                    totalWorkingHours += FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:
                    totalWage += this.empRate * PART_TIME_HOUR;
                    totalWorkingDays++;
                    totalWorkingHours += PART_TIME_HOUR;
                    break;
            }
        }
        System.out.println("Employee Wage Per Month in 100 hours or 20 days for the company " + this.company + " is " + totalWage);
        return totalWage;
    }
}