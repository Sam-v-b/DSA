package com.sam.DSA.Patterns;
//        0  0  0  0  0  0  0
//        0  1  1  1  1  1  0
//        0  1  2  2  2  1  0
//        0  1  2  3  2  1  0
//        0  1  2  2  2  1  0
//        0  1  1  1  1  1  0
//        0  0  0  0  0  0  0
public class pattern8 {
    public static void main(String[] args) {
        pattern(3);
    }

    static void pattern(int n) {
        n = 2*n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex + "  ");
            }
            System.out.println();

        }
    }
}
