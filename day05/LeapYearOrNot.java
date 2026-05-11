package day05;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if((year%4 == 0) && (year%100 != 0)){
            System.out.println("Its A Leap Year");
        }
        else if(year%400 == 0){
            System.out.println("Its a leap year");
        }
        else{
            System.out.println("Its a not a leap year");
        }
    }
}
