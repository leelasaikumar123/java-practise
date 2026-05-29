package com.example;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MathOperations{

    public int add(int a, int b) {
        Calculation addition = (x, y) -> x + y;
        return Calculation.calculateResult(a,b,addition);
    }
        public int sub(int a, int b) {
        Calculation subpraction = (x, y) -> x - y;
        return Calculation.calculateResult(a,b,subpraction);
    }
        public int mul(int a, int b) {
        Calculation multiplication = (x, y) -> x * y;
       return Calculation.calculateResult(a,b,multiplication);
    }
        public int div(int a, int b) {
        Calculation division = (x, y) -> x / y;
        return Calculation.calculateResult(a,b,division);
    }
public static void main(String[] args) {
     printListUsingClass(Arrays.asList(1,2,3,4,5,6,7,8,9));
     System.out.println();
     printListUsingIterator(Arrays.asList(1,2,3,4,5,6,7,8,9));
     System.out.println();
     printListUsingAnonomousClass(Arrays.asList(1,2,3,4,5,6,7,8,9));
     System.out.println();
     printListUsingLambdaFunction(Arrays.asList(1,2,3,4,5,6,7,8,9));
     System.out.println();
     convertionOfIntergersToDoubles(Arrays.asList(1,2,3,4,5,6,7,8,9));
     System.out.println();
     printEvenNumbersUsingPredicate(Arrays.asList(1,2,3,4,5,6,7,8,9));
    }
    public static void printListUsingClass(List<Integer> list){
    list.forEach(new ConsumerData());
}
public static void printListUsingIterator(List<Integer> list){
    Iterator ir=list.iterator();
    while(ir.hasNext()){
        System.out.print(ir.next()+" ");
    }
}

public static void printListUsingAnonomousClass(List<Integer> list){
    Consumer<Integer> consumer=new Consumer<Integer>() {
        @Override
        public void accept(Integer num){
            System.out.print(num+" ");
        }
    };
    list.forEach(consumer);
}
public static void printListUsingLambdaFunction(List<Integer> list){
    Consumer<Integer> consumer=num->{System.out.print(num+" ");};
    list.forEach(consumer);
}
public static void convertionOfIntergersToDoubles(List<Integer> list){
Function<Integer,Double> function=a -> a*1.0;
list.forEach(n->{
    System.out.println("The Double of N is "+function.apply(n));
});
}
public static void printEvenNumbersUsingPredicate(List<Integer> list){
    Predicate<Integer> predicate=a->a%2==0;
    for(int num:list){
        if(predicate.test(num)){
            System.out.println(num+" is an even number");
        }
    }
}
}
interface Calculation{
public int calculation(int a,int b);
public static int calculateResult(int a,int b,Calculation operation){
    return operation.calculation(a, b);
}
}
class ConsumerData implements Consumer<Integer>{
    @Override
    public void accept(Integer num){
     System.out.print(num+" ");
    }   
}
