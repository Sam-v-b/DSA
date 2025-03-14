package com.sam.DSA.Recursion;

import java.util.*;

public class LinearSearchByRecursion {
    public static void main(String[] args) {
        int[] arr ={2,5,3,7,8,8,91};
        ArrayList<Integer> ans =findAllIndexes1(arr,8,0);
        System.out.println(ans);

    }
//    static boolean linear(int[] arr,int target){
//        int index=0;
//        return search(arr,target,index);
//    }
    static boolean search(int[] arr,int target,int index){
        if(index == arr.length){
            return false;
        }
        return arr[index]==target || search(arr,target,index+1);

    }


    static int find(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return find(arr,target,index+1);

    }

    static int findFromLast(int[] arr,int target,int index){
        if(index == -1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findFromLast(arr,target,index-1);

    }

    static List<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr,int target,int index){
        if(index == -1){
            return;
        }
        if(arr[index]==target){
             list.add(index);
        }
        findAllIndex(arr,target,index-1);

    }


    static ArrayList<Integer> findAllIndexes(int[] arr,int target,int index,ArrayList<Integer> ansList){
        if(index == arr.length){
            return ansList;
        }
        if(arr[index]==target){
            ansList.add(index);
        }
        return findAllIndexes(arr,target,index+1,ansList);

    }

    static ArrayList<Integer> findAllIndexes1(int[] arr,int target,int index){
        ArrayList<Integer> ansList = new ArrayList<>();
        if(index == arr.length){
            return ansList;
        }
        // this will contain the answer for that particular function call only
        if(arr[index]==target){
            ansList.add(index);
        }
        ArrayList<Integer> ansFromBelowFunctionCalls = findAllIndexes1(arr,target,index+1);

        ansList.addAll(ansFromBelowFunctionCalls);

        return ansList;
    }

}
