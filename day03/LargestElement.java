package day03;

import java.util.Scanner;

public class LargestElement {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
    int maxElement=Integer.MIN_VALUE;
    for(int num:array){
        if(num>maxElement){
            maxElement=num;
        }
    }
    System.out.println("The Largest Element in the array is: "+maxElement);
    } 
}
