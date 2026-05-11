package day06;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int change=sc.nextInt();
        int notes=0;
        while(change>0){
            if(change>=1000){
                change=change-1000;
            }
            else if(change>=500){
                change=change-500;
            }
            else if(change>=100){
                change=change-100;
            }
            else if(change>=50){
                change=change-50;
            }
            else if(change>=10){
                change=change-10;
            }
            else if(change>=5){
                change=change-5;
            }
            else if(change>=2){
                change=change-2;
            }
            else if(change>=1){
                change=change-1;
            }
            notes++;
        }
        System.out.println(notes);
    }
}
