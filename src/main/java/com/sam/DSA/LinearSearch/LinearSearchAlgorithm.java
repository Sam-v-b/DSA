package com.sam.DSA.LinearSearch;

import java.util.Arrays;

public class LinearSearchAlgorithm {
    //Searching an element in an array
    static int searching(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return arr[i];
            }
        }
        return -1;
    }

    //Searching an element in a range in an array
    static int range(int[] arr, int target,int start , int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }

    //Find minimum in an array
    static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int arrs : arr){
            if(arrs < min){
                min = arrs;
            }
        }
        return min;
    }
    //Find maximun in an array
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int arrs : arr){
            if(arrs > max){
                max = arrs;
            }
        }
        return max;
    }
    //Find maximun/max in range in an array
    static int findMaxInRange(int[] arr,int start,int end){
        int max = Integer.MIN_VALUE;
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    //Searching in 2D Array
    static int[] searching2D(int[][] arr,int target){

//        int[][] array = {
//                {15,-3,3,5},
//                {7,8,45,68},
//                {91,35,23}
//        };
//        int target =45;
//        int[] ans = searching2D(array,target);
//        System.out.println(Arrays.toString(ans));

        for(int row =0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //Searching Min/Max in 2D Array

    static int maxIn2D(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] arrs:arr){
            for(int num:arrs){
                if(num>max){
                    max = num;
                }
            }
        }
        return max;
    }
}

