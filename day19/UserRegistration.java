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
    System.out.println("enter last name");
    String lastName=sc.nextLine();
    if(lastName.matches("[A-Z][a-z]{2,}")){
    System.out.println("Its Following The Regular Expression");
    }
    else{
        System.out.println("The last name should start with a capital letter and has min size of 3 characters");
    }
    System.out.println("enter email");
    String email=sc.nextLine();
        if(email.matches("[a-z]{3,}([.][a-z]{3,})?@[a-z]{2,}\\.[a-z]{2,}([.][a-z]{2,})?")){
    System.out.println("Its Following The Regular Expression");
    }
    else{
        System.out.println("the email should follow E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl\r\n" + //
                        "& co) and 2 optional (xyz & in) with\r\n" + //
                        "precise @ and . positions");
    }
    System.out.println("enter phone number first country code space and next 10 digits");
    String phoneNumber=sc.nextLine();
        if(phoneNumber.matches("[0-9]{2}\\s[6789][0-9]{9}")){
    System.out.println("Its Following The Regular Expression");
    }
    else{
        System.out.println("The phone number starts with country code and followed by 10 digits");
    }
    System.out.println("enter password");
    String password=sc.nextLine();
    if(password.matches(".{8,}")){
  System.out.println("Its Following The Regular Expression");
    }
    else{
        System.out.println("Password should have 8 characters");
    }
        if(password.matches("^(?=.*[A-Z]).{8,}$")){
  System.out.println("Its Following The Regular Expression");
    }
    else{
        System.out.println("Password should have at least one capital letter");
    }
    if(password.matches("^(?=.*[A-Z])(?=.*[0-9]).{8,}$")){
      System.out.println("Password has one numeric character");
    }
    else{
        System.out.println("Password should have at least one numeric letter");
    }
        if(password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$")){
      System.out.println("Password has one special  character");
    }
    else{
        System.out.println("Password should have at least one special letter");
    }
    System.out.println("enter an email from the file");
    if(sc.next().matches("^(?!\\.)(?!.*\\.\\.)([A-Za-z0-9]+[._+-]?[A-Za-z0-9]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,6}$")){
        System.out.println("its obeying regular expression");
    }
    else{
        System.out.println("the regular expression is wrong");
    }
    }
}
