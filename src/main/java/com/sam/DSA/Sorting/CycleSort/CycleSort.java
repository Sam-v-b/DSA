package com.sam.DSA.Sorting.CycleSort;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,5,3,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycleSort(int[] arr){
    int i = 0;
    while (i<arr.length){
        int correct = arr[i] - 1;
        if(arr[i] != arr[correct]){
            swap(arr, i,correct);
        }else {
            i++;
        }
    }
    }
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
