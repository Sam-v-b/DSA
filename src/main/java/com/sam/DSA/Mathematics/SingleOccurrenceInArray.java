package com.sam.DSA.Mathematics;

public class SingleOccurrenceInArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 5, 4, 3};
        int ans = findNumber(arr);
        System.out.println(ans);
    }

    static int findNumber(int[] arr) {
        int res = 0;
        for (int num : arr) {
            res ^= num;
        }
        return res;
    }
}
