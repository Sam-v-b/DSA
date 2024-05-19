package com.sam.DSA.Problems;

public class NthFibonacciElement {
//    Input: n=9
//    Output: 34

    public int fib(int n) {
        if (n <= 1){
            return n;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }

}
