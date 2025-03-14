package com.sam.DSA.Mathematics;

public class Prime {
    public static void main(String[] args) {
        prime(40);
    }
    static boolean isPrime(int num) {
        boolean ans = false;
        if (num <= 1) {
            return false;
        }
        int c = 2;
        while (c*c <= num){
            if(num%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }

    static void prime(int num){

        for (int i = 0; i <=num ; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
