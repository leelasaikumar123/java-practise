package day02.ifelse;

import java.util.Scanner;

public class ReadANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==1){
            System.out.println("unit");
        }
        else if(num==10){
            System.out.println("ten");
        }
        else if(num==100){
            System.out.println("hundred");
        }
        else if(num==1000){
            System.out.println("thousand");
        }
        else {
            System.out.println("Invalid Number");
        }
    }
}
