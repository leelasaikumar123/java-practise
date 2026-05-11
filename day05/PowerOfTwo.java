package day05;

public class PowerOfTwo {
   public static void main(String[] args) {
    int n=Integer.parseInt(args[0]);
    int start=0;
    while(start<=n){
        int num=(int)Math.pow(2, start);
        if(isLeapYearOrNot(num)){
            System.out.println(num +" ");
        }
        start++;
    }
   } 
public static boolean isLeapYearOrNot(int year){
if(year%4 ==0 && year%100 !=0  ){
    return true;
}
else if(year%400==0){
    return true;
}

    return false;
}
}
