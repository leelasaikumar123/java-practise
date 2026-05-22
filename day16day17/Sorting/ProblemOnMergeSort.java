package day16day17.Sorting;

import java.util.Scanner;

public class ProblemOnMergeSort {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("No Of Books");
    int size=sc.nextInt();
    System.out.println("enter the books ");
    int[] array=new int[size];
    for(int i=0;i<array.length;i++){
        array[i]=sc.nextInt();
    }
   mergeSort(array, 0, array.length-1);
   for(int i:array){
    System.out.print(i+" ");
   }
   } 
   public static void mergeSort(int[] array,int l,int r){
    if(l<r){
       int mid=(l+r)/2;
       mergeSort(array, l, mid);
       mergeSort(array, mid+1, r);
       merging(array, l, mid, r);
    }
   }
   public static void merging(int[] array,int l,int mid,int r){
   int[] lArray=new int[mid-l+1];
   int[] rArray=new int[r-mid];
   for(int i=0;i<lArray.length;i++){
    lArray[i]=array[l+i];
   }
   for(int i=0;i<rArray.length;i++){
    rArray[i]=array[mid+1+i];
   }
   int k=l;
   int i=0;
   int j=0;
   while(i<lArray.length && j<rArray.length){
    if(lArray[i]<=rArray[j]){
        array[k]=lArray[i];
        i++;
        k++;
    }
    else{
           array[k]=rArray[j];
        j++;
        k++;  
    }
   }
   while(i<lArray.length){
            array[k]=lArray[i];
        i++;
        k++;
   }
      while(j<rArray.length){
            array[k]=rArray[j];
        j++;
        k++;
   }
   }
}
