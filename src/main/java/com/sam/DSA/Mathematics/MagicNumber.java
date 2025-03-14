package com.sam.DSA.Mathematics;

public class MagicNumber {
    public static void main(String[] args) {
        magicNumber(6);
    }

    static void magicNumber(int num) {
        int ans = 0;
        int base = 5;
        while (num > 0) {
            int last = num & 1;
            num = num >> 1;
            ans += last * base;
            base = base * 5;
        }
        System.out.println(ans);;
    }
}
