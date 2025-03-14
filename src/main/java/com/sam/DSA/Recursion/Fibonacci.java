package com.sam.DSA.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciFormula(6));
    }

    static int fibonacciFormula(int n){
        return (int) (Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
    static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
