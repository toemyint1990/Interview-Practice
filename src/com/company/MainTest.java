package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void main() {
        int[] intArray = new int[] {1,3,6,4,1,2};
        int actual = Main.findMinimumPositiveNumberNotOccurInArray(intArray);
        assertEquals(5, actual);
    }

    @Test
    void fizzbuzzNormalFor() {
        Main.fizzbuzz(15);
    }

    @Test
    void fizzbuzzJava8() {
        Main.fizzBuzzJava8(15);
    }

    @Test
    void sortDates() {
        List<String> dateList = new ArrayList<>();
        dateList.add("01 Mar 2017");
        dateList.add("21 Feb 2017");
        dateList.add("21 Feb 2016");
        dateList.add("12 Jan 2016");
        Main.sortDates(dateList);
    }

    @Test
    void findTwoElements () {
        List<Integer> in = new ArrayList<>();
        in.addAll(Arrays.asList(new Integer[]{5,23,23,66,5,23,7,0}));
        Main.findTwoElements(in);
    }

    @Test
    void reverseString () {
        Main.reverseString("ToeMyint");
    }
}