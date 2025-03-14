package com.sam.DSA.Recursion;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,4};
    boolean ans = sorted(arr,0);
        System.out.println(ans);
    }
    static boolean isSorted(int[] arr){
        int index = arr[0];

        return helper(arr,index);
    }
    private static boolean helper(int[] arr, int index){
        if(index == arr.length-1){
            return arr[index-1]<=arr[index] ? true:false;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return helper(arr,index+1);
    }

    // another way
    private static boolean sorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return (arr[index]<=arr[index+1]) && sorted(arr,index+1);
    }
}
