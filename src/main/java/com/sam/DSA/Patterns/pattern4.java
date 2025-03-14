package com.sam.DSA.Patterns;

// 1
// 1 2
// 1 2 3
// 1 2
// 1

public class pattern4 {
    public static void main(String[] args) {
        pattern(5);
    }
    static  void pattern(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            // when we print one row, we need to add a new line
            System.out.println();
        }
    }
}
