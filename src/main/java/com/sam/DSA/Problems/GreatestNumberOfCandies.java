package com.sam.DSA.Problems;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {
//    Input: candies = [2,3,5,1,3], extraCandies = 3
//    Output: [true,true,true,false,true]

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies =0;
        for(int candy : candies){
            maxCandies = Math.max(candy,maxCandies);
        }
        List<Boolean> greatestCandies = new ArrayList<>();
        for(int candy :candies){
            greatestCandies.add(candy+extraCandies>=maxCandies);
        }
        return greatestCandies;
    }

}
