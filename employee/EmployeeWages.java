package employee;

import java.util.Random;

public class EmployeeWages {
  public static Random random=new Random();
  public static int total_working_days=20;
  public static int total_noof_working_hours=100;
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
    public static void wagesForFullTimeEmployee(){
     int hours=0;
     int days=0;
     int salary=0;
     while(hours<=total_noof_working_hours && days <= total_working_days){
        int num=random.nextInt(2);
        if(num==1){
          days++;
          hours=hours+8;
          salary=salary+8*20;
        }
        else{
            salary=salary+0;
            days++;
        }
     }
     System.out.println("The Salary for For This full time Emploee For This Month Is : "+salary);
    }

    public static void wagesForPartTimeEmployee(){
     int hours=0;
     int days=0;
     int salary=0;
     while(hours<=total_noof_working_hours && days <= total_working_days){
        int num=random.nextInt(2);
        if(num==1){
          days++;
          hours=hours+8;
          salary=salary+8*10;
        }
        else{
            salary=salary+0;
            days++;
        }
     }
     System.out.println("The Salary for For This Part Emploee For This Month Is : "+salary);
    }

    public static void wagesForPartTime(){
        System.out.println("The Monthly Salary Of An Part Time Employee is : "+(20*8*10));
    }

    public static void main(String[] args) {
        isEmplyeePresentOrNot();
     int num=random.nextInt(2);
     switch(num){
        case 1:
            wagesForFullTime();
            wagesForFullTimeEmployee();
             break;
        default :
              wagesForPartTime();
              wagesForPartTimeEmployee();
            break;    
     }
    }
}

