package day03;

import java.util.Scanner;

public class SmallestElement {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
    int minElement=Integer.MAX_VALUE;
    for(int num:array){
        if(num<minElement){
            minElement=num;
        }
    }
    System.out.println("The Smallest Element in the Array is: "+minElement);
    }
}
