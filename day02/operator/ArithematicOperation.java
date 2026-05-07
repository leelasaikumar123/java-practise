package day02.operator;

import java.util.Arrays;
import java.util.Scanner;

public class ArithematicOperation {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     int[] array=new int[4];
     array[0]=a+b*c;
     array[1]=c+a/b;
     array[2]=a%b+c;
     array[3]=a*b+c;
     Arrays.sort(array);
     System.out.println("The Max Value is "+array[3]+" The Min Value Is : "+array[0]);
    }
}
