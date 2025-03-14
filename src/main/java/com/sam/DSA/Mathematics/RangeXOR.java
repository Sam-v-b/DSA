package com.sam.DSA.Mathematics;

public class RangeXOR {
    public static void main(String[] args) {
    int ans = rangeXor(3,9);
        System.out.println(ans);
    }
    // range XOR from a to b = xor(b)^xor(a-1)
    static int rangeXor(int a, int b){
    int ans = xor(b)^ xor(a-1);
    return ans;
    }
    //XOR from 0 to a
    static int xor(int a){
        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        if(a%4==2){
            return a+1;
        }
        return 0;
    }
}
