package com.sam.DSA.Recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        concept(5);
    }

    //Function to print numbers
    //1,2,3,4,5
    static void print (int n){
        //Base condition
        if(n==1){
            System.out.println(1);
            return;
        }
        // body of the function
        System.out.println(n);

        // recursive call
        // this is tail recursion because this is the last function call
        print(n-1);
    }

    static void printRev(int n){
        if(n==0){
            return;
        }
        printRev(n-1);
        System.out.println(n);
    }
    static void printBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }
// we use --n instead of n--
    static void concept(int n){
        if (n==0){
           return;
        }
        System.out.println(n);
      concept(--n);

    }
}
