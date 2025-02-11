package com.sam.DSA.Sorting.CycleSort;

import java.util.Arrays;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 1, 5};
        int[] res = setMismatch(arr);
        System.out.println(Arrays.toString(res));
    }
    static int[] setMismatch(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i,correct);
            }else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                return new int[]{arr[j],j+1};
            }

        }
        return new int[]{-1,-1};
    }
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
