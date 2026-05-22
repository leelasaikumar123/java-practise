package day16day17.Searching.BinarySearch;

import java.util.Scanner;

public class BinarySearchIn2DArray {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of rows");
    int rows=sc.nextInt();
    int columns=sc.nextInt();
    System.out.println("enter matrix in sorted way");
    int[][] matrix=new int[rows][columns];
    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[i].length;j++){
        matrix[i][j]=sc.nextInt();
      }
    }
    System.out.println("Enter The Target ");
    int target=sc.nextInt();
    if(findTheIndexOfTargetInThe2DArray(matrix, target)){
        System.out.println(target+" is available in the matrix");
    }
    else{
       System.out.println(target+" isn't available in the matrix"); 
    }
   } 
   public static boolean findTheIndexOfTargetInThe2DArray(int[][] matrix,int target){
   int left=0;
   int right=(matrix.length*matrix[0].length)-1;
   while(left<=right){
    int mid=(left+right)/2;
    int row=mid/matrix[0].length;
    int col=mid%matrix[0].length;
    if(matrix[row][col]==target){
        return true;
    }
    else if(target<matrix[row][col]){
  right=mid-1;
    }
    else{
left=mid+1;
    }
   }

    return false;
   }
}
