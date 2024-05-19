package com.sam.DSA.Problems;

import java.util.HashSet;
import java.util.Set;

public class IsogramString {
//    Input: word= "codedecode"
//    Output: false

    public boolean isIsogram(String word) {
        boolean isogram = true;
        char[] ch = word.toCharArray();
        Set<Character> chSet = new HashSet<Character>();
        for(Character c : ch){
            if(chSet.contains(c)){
                isogram = false;
            }else{
                chSet.add(c);
            }
        }
        return isogram ;

    }


}
