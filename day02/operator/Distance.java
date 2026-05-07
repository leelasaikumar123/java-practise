package day02.operator;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        double distance=Math.sqrt((int)Math.pow(x, 2)+(int)Math.pow(y, 2));
        System.out.println("The Distance Is "+distance);

    }
}
