package day03;

import java.util.Scanner;

public class SecondLargestNumber {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
     int firstLargestElement=Integer.MIN_VALUE;
     int secondLargestNumber=Integer.MIN_VALUE;
     for(int num:array){
        if(num>firstLargestElement){
            secondLargestNumber=firstLargestElement;
            firstLargestElement=num;
        }
        else if(num>secondLargestNumber && num !=firstLargestElement){
            secondLargestNumber=num;
        }
     }
     System.out.println("The Second Largest Number Is"+secondLargestNumber);
    } 
}
