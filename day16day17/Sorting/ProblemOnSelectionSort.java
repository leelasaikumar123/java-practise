package day16day17.Sorting;

import java.util.Scanner;

public class ProblemOnSelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of exam scores");
        int size=sc.nextInt();
        System.out.println("enter exam scores");
        int[] marks=new int[size];
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("Before sorting");
        printExamScores(marks);
     selectionSortLogic(marks);
 System.out.println("After sorting");
        printExamScores(marks);
    }
    public static void printExamScores(int[] examScores){
        for(int n :examScores){
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public static void selectionSortLogic(int[] examScores){
        for(int i=0;i<examScores.length;i++){
            int index=-1;
            int min=Integer.MAX_VALUE;
            for(int j=i;j<examScores.length;j++){
                if(examScores[j]<min){
                    min=examScores[j];
                    index=j;
                }
            }
            int temp=examScores[i];
            examScores[i]=examScores[index];
            examScores[index]=temp;
        }
    }
}
