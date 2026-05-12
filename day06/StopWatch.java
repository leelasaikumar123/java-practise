package day06;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int seconds=sc.nextInt();
        int hours=seconds/3600;
        int minutes=(seconds%3600)/60;
        int second=seconds%60;
 System.out.println("Its Took " +hours +"hr "+minutes +"mins "+second+"sec ");
    }
}
