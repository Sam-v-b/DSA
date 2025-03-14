package com.sam.DSA.Mathematics;

public class NoOfDigits {

    // No of digits
    public static void main(String[] args) {
        int ans = setBits(45);
        System.out.println(ans);
    }

    static int noOfDigits(int n){
        int b = 2;
        int ans = (int) (Math.log(n)/Math.log(b)) +1;
       return ans;
    }

    // No of set bits
    static int setBits(int n){
        int count = 0;
        while (n > 0){
            count++;
            n = n&(n-1);
        }
        return count;
    }

}
