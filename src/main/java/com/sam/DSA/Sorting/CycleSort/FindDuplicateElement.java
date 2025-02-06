package com.sam.DSA.Sorting.CycleSort;

import java.util.ArrayList;
import java.util.List;

//Amazon and Microsoft question
public class FindDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 1, 2, 8, 8};
        List<Integer> res = findingDuplicateNumbers(arr);
        System.out.println(res);
    }

    static List<Integer> findingDuplicateNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();
        // finding duplicates
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                result.add(arr[j]);
            }
        }
        return result;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
