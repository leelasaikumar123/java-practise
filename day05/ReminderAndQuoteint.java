package day05;

import java.util.Scanner;

public class ReminderAndQuoteint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int divident=sc.nextInt();
        int divisor=sc.nextInt();
        System.out.println("The Quotient is "+divident/divisor);
        System.out.println("The Reminder is "+divident%divisor);

    }
}
