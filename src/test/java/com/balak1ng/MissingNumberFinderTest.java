package com.balak1ng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberFinderTest {

    @Test
    void testFindMissingNumber1() {
        int[] inputArray = new int[]{0, 1, 2, 4};
        assertEquals(3, MissingNumberFinder.findMissingNumber(inputArray));
    }

    @Test
    void testFindMissingNumber2() {
        int[] inputArray = new int[]{1, 3, 4, 5};
        assertEquals(2, MissingNumberFinder.findMissingNumber(inputArray));
    }

    @Test
    void testFindMissingNumber3() {
        int[] inputArray = new int[]{2, 3, 4, 6, 7, 8};
        assertEquals(5, MissingNumberFinder.findMissingNumber(inputArray));
    }

    @Test
    void testFindMissingNumber4() {
        int[] inputArray = new int[]{4, 2, 3, 0};
        assertEquals(1, MissingNumberFinder.findMissingNumber(inputArray));
    }

    @Test
    void testFindMissingNumber5() {
        int[] inputArray = new int[]{7, 9, 10, 11, 12};
        assertEquals(8, MissingNumberFinder.findMissingNumber(inputArray));
    }

    @Test
    void testFindMissingNumber6() {
        int[] inputArray = new int[]{999, 1001, 1002, 1003};
        assertEquals(1000, MissingNumberFinder.findMissingNumber(inputArray));
    }

    @Test
    void testFindMissingNumber7() {
        int[] inputArray = new int[]{7, 5, 4, 6};
        assertEquals(3, MissingNumberFinder.findMissingNumber(inputArray));
    }

    @Test
    void testFindMissingNumber8() {
        int[] inputArray = new int[]{445, 446, 444, 447};
        assertEquals(443, MissingNumberFinder.findMissingNumber(inputArray));
    }

    @Test
    void testFindMissingNumber9() {
        int[] inputArray = new int[]{0, 1, 2, 3, 4, 5};
        assertEquals(6, MissingNumberFinder.findMissingNumber(inputArray));
    }
}