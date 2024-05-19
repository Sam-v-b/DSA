package com.sam.DSA.Problems;

public class RightAndLeftRotationOfString {

    public String leftRotate(String original, int rotationChar) {
        String rotated = original.substring(rotationChar)+ original.substring(0,rotationChar);
        return rotated ;

    }
    public String rightRotate(String original, int rotationChar) {
        int partition = original.length()-rotationChar;
        String rotated = original.substring(partition)+ original.substring(0,partition);
        return rotated ;

    }

}
