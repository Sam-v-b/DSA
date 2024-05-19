package com.sam.DSA.Problems;

public class ReverseVowelsOfString {
//    Input: s = "hello"
//    Output: "holle"

    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int start =0;
        int end = s.length()-1;
        String vowel = "aeiouAEIOU";
        while(start<end){
            while(start<end && vowel.indexOf(word[start])==-1){
                start++;
            }
            while(start<end && vowel.indexOf(word[end])==-1){
                end--;
            }
            char temp = word[start];
            word[start]=word[end];
            word[end]=temp;
            start++;
            end--;
        }
        String ans = new String(word);
        return ans;
    }



}
