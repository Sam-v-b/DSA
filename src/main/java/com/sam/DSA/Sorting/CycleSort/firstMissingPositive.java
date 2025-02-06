package com.sam.DSA.Sorting.CycleSort;

public class firstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 1, 6, 3};
        int res = findFirstMissingPositive(arr);
        System.out.println(res);
    }

    static int findFirstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
