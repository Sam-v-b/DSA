package com.sam.DSA.Problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
//    Input: nums =[2,7,11,15], target = 9
//    Output: [0,1]

    //O(2n)
    public int[] twoSum(int[] nums , int target) {
        Map<Integer,Integer> input = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            input.put(nums[i],i);    // here we will get the values present in array as key of map
        }

        for(int i=0; i<nums.length; i++){
            int secondNumber = target-nums[i];
            if (input.containsKey(secondNumber) && input.get(secondNumber)!=i) {
                return new int[]{i,input.get(secondNumber)};
            }

        }
        throw new IllegalArgumentException("No such numbers Found");
    }

    //O(n)
    public int[] twoSum1(int[] nums , int target) {
        Map<Integer,Integer> input = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int secondNumber = target-nums[i];
            if (input.containsKey(secondNumber)) {
                return new int[]{i,input.get(secondNumber)} ;
            }
            input.put(nums[i],i);
        }
        throw new IllegalArgumentException("No such numbers Found");
    }
}
