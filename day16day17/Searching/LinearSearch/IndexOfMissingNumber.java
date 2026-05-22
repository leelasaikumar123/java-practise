package day16day17.Searching.LinearSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IndexOfMissingNumber {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array");  
      int size=sc.nextInt();
      System.out.println("enter array elements");
      int[] array=new int[size];
      for(int i=0;i<array.length;i++){
        array[i]=sc.nextInt();
      }
      System.out.println("The first Missing Positive Number is : "+findTheFirstMissingPositiveNumber(array));
    }
    public static int findTheFirstMissingPositiveNumber(int[] array){
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<array.length;i++){
        if(array[i]>0){
            list.add(array[i]);
        }
    }
    Collections.sort(list);
    for(int i=0;i<list.size();i++){
        if(list.get(i) != i+1){
            return i+1;
        }
    }
        return list.size()+1;
    }
}
