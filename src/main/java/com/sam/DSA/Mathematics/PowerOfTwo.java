package com.sam.DSA.Mathematics;

public class PowerOfTwo {
    public static void main(String[] args) {
        boolean ans = isPower(0);
        System.out.println(ans);
    }
    static boolean isPower(int num){
        if (num ==0){
            return false;
        }
        int ans = num & (num -1);
        return ans==0;
    }
}
