package day02.whileloop;

import java.util.Scanner;

public class ReverseOfAnInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int number=num;
        int rev=0;
        while(number>0){
            int digit=number%10;
            rev=rev*10+digit;
            number=number/10;
        }
        System.out.println("The Reverse Number of "+num+" is: "+rev);
    } 
}
