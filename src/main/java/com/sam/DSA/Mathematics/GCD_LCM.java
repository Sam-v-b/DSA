package com.sam.DSA.Mathematics;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(lcm(4,5));
    }
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
//         return a==0?b:gcd(b%a,a);
    }

    static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}
