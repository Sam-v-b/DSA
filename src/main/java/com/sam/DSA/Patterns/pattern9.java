package com.sam.DSA.Patterns;

//        3  3  3  3  3
//        3  2  2  2  3
//        3  2  1  2  3
//        3  2  2  2  3
//        3  3  3  3  3

public class pattern9 {


    public static void main(String[] args) {
        pattern(3);
    }

    static void pattern(int n) {
        int originalN = n;
        n = 2 * n - 2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + "  ");
            }
            System.out.println();

        }
    }
}
