package com.sam.DSA.BinarySearch;

public class SplitArrayLargestSum {
    static int splitArray(int[] arr, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]); // in the end of the loop this will contain the max item from the array
            end += arr[i];
        }
        //binary search
        while (start < end) {
            //try for the middle as potential answer
            int mid = start + (end - start) / 2;
            // calculate how many pieces we can divide this with  maximum sum we got here.
            int sum = 0;
            int pieces = 1;
            for (int arrs : arr) {
                if (sum + arrs > mid) {
                    // we can't make this sub array.. need to make new one
                    // say  you add this arrs in new sub array then sum = arrs
                    sum = arrs;
                    pieces++;
                } else {
                    sum += arrs;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            }else{
                end = mid;
            }

        }
        return end; // here start == end
    }
}
