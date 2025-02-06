package com.sam.DSA.BinarySearch;

public class InfiniteArray {
    static int findingAnswer(int[] arr, int target) {
        //First need to find the range
        // start with box of size 2
        int start = 0;
        int end = 1;
        //condition for the target to lie in range, keep doubling till target element id greater than end
        while (target > arr[end]) {
            int temp = end + 1; //this is the new start
            //double the box value
            //new end = previous end + size of box * 2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearchInfinite(arr,target,start,end);
    }

    static int binarySearchInfinite(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
