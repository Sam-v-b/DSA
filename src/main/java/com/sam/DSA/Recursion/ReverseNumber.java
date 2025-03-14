package com.sam.DSA.Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse2(1234));


    }

    static int ans = 0;

    static void reverse1(int n) {
        if (n == 0) {
            return;
        }
        int rem = (n % 10);
        ans = ans * 10 + rem;
        reverse1(n / 10);
    }

    static int reverse2(int n) {
        // if we don't want separate variable as case 1,
        // then we might need a helper method to handle place values
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);

    }
}
