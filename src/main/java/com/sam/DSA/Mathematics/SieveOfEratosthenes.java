package com.sam.DSA.Mathematics;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] ans = new boolean[n+1];
        sieve(n,ans);
    }
    static void sieve(int n, boolean[] ans){
        for (int i = 2; i*i <= n ; i++) {
            if(!ans[i]){
                for (int j = i*2; j <=n ; j+=i) {
                    ans[j] = true;
                }
            }

        }
        for (int i = 2; i <=n ; i++) {
            if(!ans[i]){
                System.out.println(i+" ");
            }
            
        }

    }
}
