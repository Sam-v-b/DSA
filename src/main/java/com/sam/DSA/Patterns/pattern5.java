package com.sam.DSA.Patterns;

//        *
//        * *
//        * * *
//        * * * *
//        * * *
//        * *
//        *

public class pattern5 {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        for (int i = 1; i <= (2 * n); i++) {
            int col = i > n ? (2 * n - i) : i ;
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
