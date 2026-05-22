package day16day17.Sorting;

import java.util.Scanner;

public class ProblemOnBubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Students");
        int size=sc.nextInt();
        System.out.println("enter students marks");
        int[] marks=new int[size];
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("Marks Of The Students Before Sorting");
        printMarksOfStudent(marks);
          bubbleSortLogic(marks);
              System.out.println("Marks Of The Students After Sorting");
        printMarksOfStudent(marks);
    }
    public static void printMarksOfStudent(int[] marks){
   for(int n:marks){
    System.out.print(n+" ");
   }
        System.out.println();
    }
    public static void bubbleSortLogic(int[] marks){
        for(int i=0;i<marks.length-1;i++){
            for(int j=0;j<marks.length-1-i;j++){
                if(marks[j]>marks[j+1]){
                    int temp=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;
                }
            }
        }
    }
}
