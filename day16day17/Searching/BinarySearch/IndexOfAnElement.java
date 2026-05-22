package day16day17.Searching.BinarySearch;

import java.util.Scanner;

public class IndexOfAnElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();
        System.out.println("enter array in sorted way");
        int[] array=new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("enter the target");
        int target=sc.nextInt();
        int index=findIndex(target, array);
        if(index==-1){
            System.out.println("The element you are looking for is not available in the array");
        }
        else{
            System.out.println(target+" is in "+index+" index");
        }
    }
    public static int findIndex(int target,int[] array){
        int low=0;
        int high=array.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(array[mid]==target){
                return mid;
            }
            else if(target>array[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
