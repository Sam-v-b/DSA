package com.sam.DSA.Mathematics;

public class Factors {
    public static void main(String[] args) {
        printFactors(40);
    }
// Time Complexity = O(sqrt(n))
    static void printFactors(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if(n/i == i){
                    System.out.println(i);
                }
                System.out.print(i + " " + n / i + " ");
            }
        }
    }
}
