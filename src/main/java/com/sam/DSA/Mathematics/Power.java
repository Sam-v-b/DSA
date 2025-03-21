package com.sam.DSA.Mathematics;

public class Power {

    // finding the value of  a raised to the power b
    public static void main(String[] args) {
        int base = 3;
        int power = 6;

        int ans = 1;
        while(power>0){
            if((power & 1) == 1){
                ans = ans*base;
            }
            base *= base;
            power = power>>1;
        }
        System.out.println(ans);
    }
}
