package day16day17.Searching.BinarySearch;

import java.util.Scanner;

public class FindingPeak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter The array");
        for(int i=0;i<array.length;i++){
        array[i]=sc.nextInt();
        }
        System.out.println("the peak element in the arrat is : "+array[findPeakIndex(array)]);
    }
    public static int findPeakIndex(int[] array){
        if(array.length==1){
          return 0;
        }
        int low=0;
        int high=array.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(mid-1<0){
                if(array[mid]>array[mid+1]){
                     return mid;
                }
                else{
                    low=mid+1;
                }
            }
            else if(mid+1==array.length){
                     if(array[mid]>array[mid-1]){
                     return mid;
                }
                 else{
                    high=mid-1;
                }
            }
            else if(array[mid]>array[mid+1] && array[mid]>array[mid-1]){
                return mid;
            }
            else if(array[mid-1]>array[mid]){
                high=mid-1;
            }
            else if(array[mid+1]>array[mid]){
                low=mid+1;
            }
        }

        return (low+high)/2;
    }
}
