package com.sam.DSA.Patterns;

//    1
//   212
//  32123
// 4321234
//543212345

public class pattern7 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            int numberOfSpaces = n-row;
            for (int s = 0; s < numberOfSpaces; s++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1  ; col--) {
                System.out.print(col+ " ");
            }
            for (int col = 2; col <= row ; col++) {
                System.out.print(col+ " ");
            }
            System.out.println();

        }
    }
}
