package day06;

import java.util.Scanner;

public class ReverseAnNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int n=num;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println(rev);
    }
}