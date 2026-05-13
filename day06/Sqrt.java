package day06;
import java.util.*;
public class Sqrt{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    double n=sc.nextDouble();
    System.out.println("Square root of "+n+" is : "+sqrt(n));
    }
    public static double sqrt(double c){
double epsilon = 1e-15;
double t=c;

    while (Math.abs(t - c / t) > epsilon * t) {
            t=(t+c/t)/2.0;
        }

        return t;
    }
}