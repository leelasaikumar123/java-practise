package employee;

import java.util.Random;

public class EmployeeWages {
   static Random random=new Random();
    static{
        System.out.println("welcome to employee wages computation program");
    }
    public static void isEmplyeePresentOrNot(){
        int num=random.nextInt(2);
        int day=random.nextInt(20)+1;
        if(num==1){
            System.out.println("The employee is present on "+day);
        }
        else{
           System.out.println("The employee is absent on "+day); 
        }
    }
        public static void wagesForFullTime(){
        System.out.println("The Monthly Salary Of An Full Time Employee is : "+(20*8*20));
    }
    public static void wagesForPartTime(){
        System.out.println("The Monthly Salary Of An Part Time Employee is : "+(20*4*20));
    }

    public static void main(String[] args) {
        isEmplyeePresentOrNot();
        wagesForFullTime();
        wagesForPartTime();
    }
}
