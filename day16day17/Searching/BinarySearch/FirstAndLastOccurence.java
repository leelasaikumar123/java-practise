package day16day17.Searching.BinarySearch;

import java.util.Scanner;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int size=sc.nextInt();
        System.out.println("Enter The array in sorted way");
        int[] array=new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter The Target ");
        int target=sc.nextInt();
        int firstOccurence=findFirstOccurence(array, target);
        int lastOccurence=findLastOccurence(array, target);
        System.out.println("The First Occurence is : "+firstOccurence);
        System.out.println("The last Occurence is : "+lastOccurence);
    }
    public static int findFirstOccurence(int[] array,int target){
    int low=0;
    int high=array.length-1;
    boolean flag =false;
    while(low<=high){
        int mid=(low+high)/2;
        if(target==array[mid]){
          flag=true;
          high=mid-1;
        }
       else if(target<array[mid]){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    if(flag){
     return low;
    }
    return -1;
    }
        public static int findLastOccurence(int[] array,int target){
   int low=0;
    int high=array.length-1;
    boolean flag=false;
    while(low<=high){
        int mid=(low+high)/2;
        if(target==array[mid]){
            flag=true;
            low=mid+1;
        }
       else if(target>array[mid]){
           low=mid+1;
        }
        else{
          high=mid-1;  
        }
    }
          if(flag){
     return high;
    }
    return -1;
    }
}
