package day02.whileloop;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int number=num;
        int sum=0;
        while(num>0){
            sum=sum+num;
            num--;
        }
        System.out.println("The Sum of first "+number+" numbers is: "+sum);
    }
}
