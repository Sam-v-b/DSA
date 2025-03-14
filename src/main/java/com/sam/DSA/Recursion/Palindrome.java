package com.sam.DSA.Recursion;

public class Palindrome {
    public static void main(String[] args) {
        boolean ans = palindrome(1234321);
        System.out.println(ans);
    }
    static boolean palindrome(int n){

        return n==reverse2(n);
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
