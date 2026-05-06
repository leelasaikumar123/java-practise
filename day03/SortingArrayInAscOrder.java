package day03;

import java.util.Scanner;

public class SortingArrayInAscOrder {
            public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
selectionSort(array);
  for(int num:array){
    System.out.print(num+" ");
  }
    }
    public static void selectionSort(int[] array){
        for(int i=0;i<array.length;i++){
            int index=-1;
            int minValue=Integer.MAX_VALUE;
            for(int j=i;j<array.length;j++){
                if(array[j]<minValue){
                    minValue=array[j];
                    index=j;
                }
            }
            int temp=array[i];
            array[i]=array[index];
            array[index]=temp;
        }
    }
}
