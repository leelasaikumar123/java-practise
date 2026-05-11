package day06;

import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        System.out.println("Enter 1 from F to C and enter 2 from C to F");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice==1){
            float fahrenheit=sc.nextFloat();
            System.out.println((fahrenheit-32)*((5+0.0f)/9)+" C");
        }
        else{
            float celcius=sc.nextFloat();
            System.out.println((celcius*((9+0.0f)/5))+32 +" F");
        }
    }
}
