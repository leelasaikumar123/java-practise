package day02.operator;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int delta=b*b-4*a*c;
double root1=((b*-1)+Math.sqrt(delta))/(2*a);
double root2=((b*-1)-Math.sqrt(delta))/(2*a);
System.out.println("The Roots Are "+root1+" "+root2);
    }
}
