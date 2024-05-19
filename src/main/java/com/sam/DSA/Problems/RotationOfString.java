package com.sam.DSA.Problems;

public class RotationOfString {
//    Input: original= "decode", tobechecked ="codede"
//    Output: true

    public Boolean checkRotation(String original, String tobechecked) {
        String concatenated= original+original;
        if(concatenated.contains(tobechecked))
            return true;
        return false;

    }


}
