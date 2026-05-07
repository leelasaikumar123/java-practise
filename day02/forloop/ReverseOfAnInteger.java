package day02.forloop;

import java.util.Scanner;

public class ReverseOfAnInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        String s=""+num;
        for(int i=s.length()-1;i>=0;i--){
            rev=rev*10+(s.charAt(i)-48);
        }
        System.out.println("The Reverse Number of "+num+" is : "+rev);
    }
}
