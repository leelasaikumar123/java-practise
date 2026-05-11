package day05;

import java.util.Random;
import java.util.Scanner;

public class PercentageOfHeadAndTail{
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int turns=sc.nextInt();
        int start=1;
        int heads=0;
        int tails=0;
        while(start<=turns){
         float flip=random.nextFloat(1);
         if(flip<0.5f){
            tails++;
         }
         else{
            heads++;
         }
         start++;
        }
        System.out.println("Percentage of getting head : "+(((heads+0.0f)/turns))*100);
        System.out.println("Percentage of getting tail : "+(((tails+0.0f)/turns))*100);
    }
}