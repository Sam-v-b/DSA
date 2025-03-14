package com.sam.DSA.Patterns;

//        * * * *
//        * * *
//        * *
//        *

public class pattern3 {
    public static void main(String[] args) {
        pattern(5);
    }
    static  void pattern(int n){
//        for (int i = 1; i<=n ; i++) {
//            for (int j = n; j >= i ; j--) {
//                System.out.print("* ");
//            }
        for (int i = 1; i<=n ; i++) {
            for (int j =1; j <= n+1-i ; j++) {
                System.out.print("* ");
            }
            // when we print one row, we need to add a new line
            System.out.println();
        }
    }
}
