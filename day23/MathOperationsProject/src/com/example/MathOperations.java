package com.example;

public class MathOperations{

    public int add(int a, int b) {
        Calculation addition = (x, y) -> x + y;
        return addition.calculation(a, b);
    }
        public int sub(int a, int b) {
        Calculation addition = (x, y) -> x - y;
        return addition.calculation(a, b);
    }
         public int mul(int a, int b) {
        Calculation addition = (x, y) -> x * y;
        return addition.calculation(a, b);
    }
        public int div(int a, int b) {
        Calculation addition = (x, y) -> x / y;
        return addition.calculation(a, b);
    }

}
interface Calculation{
public int calculation(int a,int b);
}
