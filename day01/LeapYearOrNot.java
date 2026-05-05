package day01;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
if((year%4==0 && year%4 !=0) || (year%400==0)){
    System.out.println(year+" The Given Year Is An Leap Year");
}
else{
    System.out.println(year+" The Given Year Is  Not An Leap Year");
}
    }
}
