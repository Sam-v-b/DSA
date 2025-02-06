package com.sam.DSA.StreamProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProblem {
    public void find() {
        //Second max element in an array
        int[] arr = {1, 2, 3, 4, 5, 6};
        List<Integer> out = Arrays.stream(arr).mapToObj(i -> (int) i).sorted((a, b) -> b - a).skip(1).limit(1).collect(Collectors.toList());
        System.out.println(out);

        // Characters of string with its frequency
        String name = "Shambhavi";
        Map<Character, Long> count = name.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        count.forEach((c, counts) -> System.out.println(c + " " + counts));
    }

}
