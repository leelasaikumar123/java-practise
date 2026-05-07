package day02.operator;

import java.util.Scanner;

public class SpringSeason {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int month=Integer.parseInt(args[0]);
    int day=Integer.parseInt(args[1]);
    if ((month>=3 && day>=20) && (month<=6 && day <=20)){
        System.out.println("Its is a spring season");
    }
    else{
        System.out.println("Its Not a spring season");
    }
   } 
}
