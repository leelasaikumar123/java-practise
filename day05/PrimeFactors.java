package day05;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=2;i<=num/2;i++){
            if(iIsPrime(i)){
                if(num%i==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
    public static boolean iIsPrime(int num){
    for(int i=2;i<=num/2;i++){
        if(num%i==0){
            return false;
        }
    }

        return true;
    }
}
