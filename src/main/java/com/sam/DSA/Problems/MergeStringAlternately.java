package com.sam.DSA.Problems;

public class MergeStringAlternately {
//    Input: word1 = "abc", word2 = "pqr"
//    Output: "apbqcr"

    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
                res.append(word1.charAt(i));
            }
            if(i<word2.length()){
                res.append(word2.charAt(i));
            }
            i++;
        }
        return res.toString();
    }

}
