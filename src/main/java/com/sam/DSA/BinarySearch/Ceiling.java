package com.sam.DSA.BinarySearch;

public class Ceiling {

    //smallest number which is greater than or equal to the given target
    static int ceiling(int[] arr, int target) {
        //If there is no ceiling (if target is greater than all other elements in array)
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
