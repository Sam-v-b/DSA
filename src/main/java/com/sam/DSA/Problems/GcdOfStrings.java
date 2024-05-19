package com.sam.DSA.Problems;

public class GcdOfStrings {
//    Input: str1 = "ABCABC", str2 = "ABC"
//    Output: "ABC"

    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2 + str1)){
            return "";
        }
        int gcd = gcd(str1.length(),str2.length());
        return str1.substring(0,gcd);
    }
    private int gcd(int i, int j){
        return j == 0 ? i : gcd(j, i % j);
    }

}
