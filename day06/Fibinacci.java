package day06;

import java.util.Scanner;

public class Fibinacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println(0);
        }
       else if(n==2){
            System.out.print(0+" "+1);
        }
        else{
            int num=3;
            int num1=0;
            int num2=1;
             System.out.print(0+" "+1+" ");
            while(num<=n){
                int num3=num1+num2;
                System.out.print(num3+" ");
                num1=num2;
                num2=num3;
                num++;
            }
        }
    }
}
