package day16day17.Sorting;

import java.util.Scanner;

public class ProblemOnCountingAlgorithm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of entries");
        int size=sc.nextInt();
        int[] ages=new int[size];
        int[] output = new int[size];
        System.out.println("enter ages");
        for(int i=0;i<ages.length;i++){
            ages[i]=sc.nextInt();
        }
        int[] countArray=new int[9];
        for(int i=0;i<ages.length;i++){
            countArray[ages[i]-10]=countArray[ages[i]-10]+1;
        }
        for(int i=1;i<countArray.length;i++){
            countArray[i]=countArray[i]+countArray[i-1];
        }
        int j=ages.length-1;
        while(j>=0){
            int value=countArray[ages[j]-10];
            countArray[ages[j]-10]=value-1;
            output[value-1]=ages[j];
            j--;
        }
        System.out.println("Sorted ages");

for(int i=0;i<output.length;i++){
    System.out.print(output[i]+" ");
}
    }
}
