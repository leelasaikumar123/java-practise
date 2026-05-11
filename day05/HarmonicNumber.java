package day05;

import java.util.Scanner;

public class HarmonicNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+((1+0.0f)/i);
        }
        System.out.println("The Harmonic Number is: "+sum);
    }
}
