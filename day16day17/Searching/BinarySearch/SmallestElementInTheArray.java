package day16day17.Searching.BinarySearch;

import java.util.Scanner;

public class SmallestElementInTheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array ");
        System.out.println("please size must be greater than 0");
        int size=sc.nextInt();
        System.out.println("enter the rotated sorted Array");
        int[] array=new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int index=findTheIndexOfSmallestElement(array);
        System.out.println("The Smallest Element In the Array Is In the Position : "+index);
    }
    public static int findTheIndexOfSmallestElement(int[] array){
 
int low=0;
int high=array.length-1;
while(low<high){
    int mid=(low+high)/2;
    if(array[mid]>array[high]){
        low=mid+1;
    }
    else {

    high=mid;
    }
}  
  return low;
    }
}
