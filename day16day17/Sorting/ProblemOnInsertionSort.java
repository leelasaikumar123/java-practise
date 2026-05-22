package day16day17.Sorting;

import java.util.Scanner;

public class ProblemOnInsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("no of employee ids ");
        int size=sc.nextInt();
        System.out.println("enter the employee ids");
        int[] emplyeeIDS=new int[size];
        for(int i=0;i<emplyeeIDS.length;i++){
            emplyeeIDS[i]=sc.nextInt();
        }
        System.out.println("Before Sorting ");
        printEmpIds(emplyeeIDS);
    insertionSortLogic(emplyeeIDS);
             System.out.println("After Sorting ");
        printEmpIds(emplyeeIDS);   
    }
    public static void printEmpIds(int[] ids){
        for(int id:ids){
            System.out.print(id+" ");
        }
 System.out.println();
    }
    public static void insertionSortLogic(int[] ids){
        for(int i=0;i<ids.length-1;i++){
            for(int j=i+1;j>0;j--){
           if(ids[j]<ids[j-1]){
            int temp=ids[j];
            ids[j]=ids[j-1];
            ids[j-1]=temp;
           }
            }
        }
    }
}
