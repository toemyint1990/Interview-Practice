package com.company;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static int findMinimumPositiveNumberNotOccurInArray (int[] A)  {

        Set<Integer> set = Arrays.stream(A)
                                 .boxed().filter(i -> i > 0)
                                 .collect(Collectors.toSet());

        for (int i = 1 ; i <= A.length + 1; i++) {
            if (!set.contains(i)) return i;
        }

        int sum = Arrays.stream(A).sum();
        return 0;

    }

}
