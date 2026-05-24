package day19;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    System.out.println("Enter First Name");
    String firstName=sc.nextLine();
    if(firstName.matches("[A-Z][a-z]{2,}")){
    System.out.println("Its Following The Regular Expression");
    }
    else{
        System.out.println("The first name should start with a capital letter and has min size of 3 characters");
    }
    }
}
