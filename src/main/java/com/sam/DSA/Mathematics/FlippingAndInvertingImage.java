package com.sam.DSA.Mathematics;

import java.util.Arrays;

public class FlippingAndInvertingImage {
    public static void main(String[] args) {
        int[][] image = {
                {1,0,0},
                {1,0,1},
                {0,0,1}
        };

        System.out.println(Arrays.toString(flippingAndInverting(image)));

    }
    static int[][] flippingAndInverting(int[][] image){
        for(int[] row : image){
           // reverse this array
            for (int i = 0; i < (image[0].length +1)/2; i++) {
                //swapping
                int temp= row[i]^1;
                row[i] = row[image[0].length-i-1]^1;
                row[image[0].length-i-1] = temp;
            }
        }
        return image;
    }

}

//    public int[][] flipAndInvertImage(int[][] image) {
//        for(int[] row : image){
//            // reverse this array
//            for (int i = 0; i < (row.length +1)/2; i++) {
//                //swapping
//                int temp= row[i]^1;
//                row[i] = row[row.length-i-1]^1;
//                row[row.length-i-1] = temp;
//            }
//        }
//        return image;
//    }
