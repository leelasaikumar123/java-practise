package day05;

import java.util.Scanner;

public class WindChill {
 public static void main(String[] args) {
    
    int t=Integer.parseInt(args[0]);
    int v=Integer.parseInt(args[1]);
    double w=35.74f+0.6215*t+((0.4275*t-35.75)*(Math.pow(v, 0.16)));
    System.out.println(w);
 }   
}
