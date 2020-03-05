package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    public static void fizzbuzz (int n) {

        for (int i = 1; i <= n; i++) {
            if (i%15 == 0) {
                System.out.println("Fizzbuzz");

            }
            else if (i%3 == 0) {
                System.out.println("Fizz");

            }
            else if (i%5 == 0) {
                System.out.println("Buzz");

            }
            else {
                System.out.println(i);
            }
        }
    }

    public static void fizzBuzzJava8 (int n){
       IntStream.rangeClosed(1,n)
               .mapToObj(i -> i % 3 == 0 ? ( i % 5 == 0 ? "Fizzbuzz" : "Fizz")
                       : ( i % 5 == 0 ? "Buzz" : i))
               .forEach(System.out::println);
    }

    public static List<String> sortDates(List<String> dates) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        List<String> dateList = dates.stream()
                .sorted(Comparator.comparing(s-> LocalDate.parse(s, formatter)))
                .collect(Collectors.toList());

        return dateList;
    }

    public static List<Integer> findTwoElements (List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int count = 1;
        for (Integer integer : list) {
            if (map.keySet().contains(integer)) {
                int value = map.get(integer);
                map.replace(integer, value + 1);
            }
            else map.put(integer, count);
        }
        map.entrySet().forEach(es -> {
            if(es.getValue() == 1) result.add(es.getKey());
        });
        List<Integer> sub = result.subList(0,2);
        return  sub;
    }

    public static String reverseString (String s) {
        char[] charArray = s.toCharArray();
        String st = new String();
        for (int i = charArray.length - 1 ; i >= 0 ; i--) {
            st += charArray[i] + " ";

        }
        return st;
    }



}
