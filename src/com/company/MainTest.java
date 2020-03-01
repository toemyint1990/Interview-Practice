package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}