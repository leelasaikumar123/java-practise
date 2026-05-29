package com.example;

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

}
interface Calculation{
public int calculation(int a,int b);
public static int calculateResult(int a,int b,Calculation operation){
    return operation.calculation(a, b);
}
}
