package day16day17.Searching.LinearSearch;

import java.util.Scanner;

public class FirstNegativeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int index=findIndex(array);
        System.out.println((index==-1)?"The Negative element you are searching for not available":"The first Negative Number is Availabel at : "+index);
    }
    public static int findIndex(int[] array){
     for(int i=0;i<array.length;i++){
        if(array[i]<0){
            return i;
        }
     }

        return -1;
    }
}
