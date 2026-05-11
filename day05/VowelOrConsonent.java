package day05;

import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char alphabet=sc.next().toLowerCase().charAt(0);
        if(alphabet=='a' || alphabet == 'e' || alphabet=='i' || alphabet=='o' || alphabet =='u' ){
            System.out.println("Its a Vowel");
        }
        else{
            System.out.println("Its a Consonent");
        }
    }
}
