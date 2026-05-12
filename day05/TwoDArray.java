package day05;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray{
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
    int columns=sc.nextInt();
    int[][] matrix=new int[rows][columns];
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
    PrintWriter pw=new PrintWriter(System.out);
        for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            pw.print(matrix[i][j]+" ");
        }
       pw.println();
    }
    pw.flush();
   } 
}