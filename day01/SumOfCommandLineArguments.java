package day01;

public class SumOfCommandLineArguments {
    public static void main(String[] args) {
        int sum=0;
        int noOfInvalidIntegers=0;
 for(String val:args){
         try {
            Integer.parseInt(val);
            sum=sum+Integer.parseInt(val);
        } catch (Exception e) {
            noOfInvalidIntegers++;
        }  
 }
 System.out.println("Sum is: "+sum);
 System.out.println("Number Of Non Valid Integers: "+noOfInvalidIntegers);
    }
}
