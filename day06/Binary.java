package day06;

import java.util.Scanner;

public class Binary {
    public static String toBinary(int num){
        String s="";
   while(num>=3){
    s=s+num%2;
    num=num/2;
   }
   if(num==2){
    s=s+"01";
   }
   if(num==1){
    s=s+1;
   }
   String s1="";
   for(int i=s.length()-1;i>=0;i--){
    s1=s1+s.charAt(i);
   }
 return s1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
     System.out.println("The Binary Number of : "+num+" is : "+toBinary(num));   
    }
}
