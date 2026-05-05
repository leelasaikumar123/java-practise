package day01;

import java.util.Scanner;

public class StringsEqualOrNot {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String firstString=sc.nextLine();
    String secondString=sc.nextLine();
    if(firstString.equals(secondString)){
        System.out.println("Both Strings Are Equal");
    }
    else{
        System.out.println("Both Strings are Not Equal");
    }
   } 
}
