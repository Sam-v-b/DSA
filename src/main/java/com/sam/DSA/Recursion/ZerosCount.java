package com.sam.DSA.Recursion;

public class ZerosCount {
    public static void main(String[] args) {
        System.out.println(count(1000100));
    }

    static int zerosCount(int n){
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem == 0){
                count++;
            }
            n= n/10;
        }
        return count;
    }

    //using recursion

    static int count(int n){
        return helper(n,0);
    }
    private static int helper(int n, int count){
        if(n==0){
            return count;
        }
        if(n%10 ==0){
            return helper(n/10,count+1);
        }
        return helper(n/10,count);
    }
}
