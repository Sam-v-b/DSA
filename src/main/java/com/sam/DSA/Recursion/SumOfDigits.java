package com.sam.DSA.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(productOfDigits(1236));
    }

    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    // product
    static int productOfDigits(int n) {
        if (n%10 == n) {
            return n;
        }
        return (n % 10) * sumOfDigits(n / 10);
    }
}
