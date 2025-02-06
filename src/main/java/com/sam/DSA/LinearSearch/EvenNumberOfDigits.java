package com.sam.DSA.LinearSearch;

public class EvenNumberOfDigits {
    static int evenNoOfDigits(int[] arr){
        int count =0;
        for(int nums : arr){
            if(even(nums)){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int nums) {
        int noOfDigits = digits(nums);
        return noOfDigits % 2 == 0;
    }

    private static int digits(int nums) {
        int count = 0;
        while(nums>0){
            count++;
            nums = nums/10;
        }
        return count;
    }


}
