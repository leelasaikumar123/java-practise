package day06;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int factors=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                factors++;
            }
        }
        if(number<2){
            System.out.println("It's Not a prime Number");
        }
        else{
            System.out.println((factors>2)?"It's Not a prime Number":"Its ia a prime number");
        }
    }
}
