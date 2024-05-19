package com.sam.DSA.Problems;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharInString {
    // O(n^2)
    public Set<Character> findDuplicate(String name) {
        Set<Character> duplicates = new LinkedHashSet<>();
        for(int i=0; i<name.length(); i++){
            for(int j=i+1; i<name.length(); j++){
                if(name.charAt(i)==name.charAt(j)){
                    duplicates.add(name.charAt(j));
                }
            }
        }
        return duplicates ;

    }
    // O(n)
    public Set<Character> findDuplicate1(String name) {
        Set<Character> set = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for(char c :name.toCharArray()){
            if(!set.add(c)){
                duplicates.add(c);
            }
        }
        return duplicates ;
    }

}
