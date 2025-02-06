package com.sam.DSA.BinarySearch;

public class PeakIndex {
    static int peakElementInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // I means we are in descending part of the array,
                // this might be the answer, but we need to check left array
                end = mid;
                // this end might be tha answer so we are not making end as mid-1
            } else {
                // we are in ascending part of array, here we know that mid+1 > mid ,
                // hence making it as start.
                start = mid + 1;
            }
        }
        // in the end start == end and pointing to the largest element in tha array,
        // start and end pointers are always trying to find max elements via  two checks above
        return start; // or return end; as both point to same element.
    }


    // searching in Mountain Array
    static int searchInMountain(int[] arr, int target){
        int peak = peakElementInMountainArray(arr);
        int firstTry = orderAgnostic(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnostic(arr,target,peak+1,arr.length-1);
    }
    static int orderAgnostic(int[] arr, int target, int start ,int end ){

        boolean isAsc = arr[start] < arr[end];
        while(start<end){
            int mid = start - (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
