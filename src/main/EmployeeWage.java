package main;

public class EmployeeWage {
    public final int IS_PRESENT=1;
    public final int IS_ABSENT=0;
    public int isEmployeePresent(){
        int attend=(int)(Math.random()*10)%2;
        if(attend==IS_PRESENT)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
        return attend;
    }
}