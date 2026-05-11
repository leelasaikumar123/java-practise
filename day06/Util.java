package day06;

public class Util {
    public static void main(String[] args) {
       System.out.println(monthlyPayment(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Float.parseFloat(args[2]))); ;
    }
    public static float monthlyPayment(int p,int y,float R) {
      int n=y*12;
      float r=R/(12*100);
      float payment=p*r/(1-(float)Math.pow(1+r, n*-1));
        return payment;
    }
}
