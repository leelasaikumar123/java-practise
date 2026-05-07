package day02.switchcase;

import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().toLowerCase().charAt(0);
        switch (c) {
            case 'a':
                System.out.println("Its a Vowel");
                break;
          case 'e':
                System.out.println("Its a Vowel");
                break;
                  case 'i':
                System.out.println("Its a Vowel");
                break;
                  case 'o':
                System.out.println("Its a Vowel");
                break;
                  case 'u':
                System.out.println("Its a Vowel");
                break;
            default:
                System.out.println("Its a Consonent");
                break;
        }
    }
}
