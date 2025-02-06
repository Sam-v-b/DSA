package com.sam.DSA.Sorting;

import java.sql.SQLOutput;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,5,3,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step max element will come at the end
            for (int j = 1; j < arr.length-i; j++) {
                // swap if item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if we didn't swap for particular value then it is already sorted hence break.
            if(!swapped){
                break;
            }
        }
    }
}
