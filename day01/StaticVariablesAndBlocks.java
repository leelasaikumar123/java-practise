package day01;

public class StaticVariablesAndBlocks {
    static int a;
    static{
        a=100;
    }
    public static void main(String[] args) {
      Demo d1=new Demo();
      System.out.println("The value of a is: "+d1.getValue());  
      a=a+1;
       Demo d2=new Demo();
      System.out.println("The value of a is: "+d2.getValue());
    }
}
    class Demo{
        public int getValue(){
            return StaticVariablesAndBlocks.a;
        }
    }

