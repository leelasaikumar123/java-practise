package day16day17.Sorting;

import java.util.Scanner;

public class ProblemOnQuickSort {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of products");
        int size=sc.nextInt();
        System.out.println("enter product prices");
        int[] prices=new int[size];
        for(int i=0;i<prices.length;i++){
            prices[i]=sc.nextInt();
        }
  quickSort(prices, 0, size-1);

        for(int price:prices){
            System.out.print(price+" ");
        }
    }
    public static void quickSort(int[] array,int low,int high){
        if(low<high){
            int pivot=findPivot(array, low, high);
            quickSort(array, low, pivot-1);
            quickSort(array, pivot+1, high);
        }
    }
    public static int findPivot(int[] array,int low,int high){
        int i=low-1;
        int pivot=array[high];
  for(int j=low;j<high;j++){
    if(array[j]<pivot){
        i++;
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
  }
         int temp=array[i+1];
        array[i+1]=array[high];
        array[high]=temp;
        return i+1;
    }
}
