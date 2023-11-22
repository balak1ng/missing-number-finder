package com.balak1ng;

/**
 * Given array of sequent numbers 0,1,2,3...N with a single missing member.
 * Function finds a first missing number occurrence in the sequence.
 * This function is written using constraints (we are not using any validator):
 * 1) Every number in the input array is a non-negative integer.
 * 2) Every number in the input array is unique.
 * 3) Every number in the input array is in range [X ; X + N], where N = inputArray.length.
 * 4) There is only one missing number in the input array.
 * 4.1) Missing number can't be smaller than the minimum value in the input array.
 * 4.2) If input array contains all sequent numbers from X to X + N, then the missing number will be X + N + 1.
 */
public class MissingNumberFinder {
    /**
     * The problem can be solved with using of XOR (bitwise) operation.
     * First of all we calculate total XOR of each number in the input array.
     * Knowing that one number in the sequence is missing -> we calculate the required XOR.
     * That value can be found by using XOR on values starting from the minimum MIN in the input array,
     * incrementing it step by step until we reach the value of MIN + n + 1, where n = inputArray.length.
     * At the end we just use XOR on both XORs calculated before, and that will be the answer.
     * Time complexity: O(n), n = inputArray.length + 1.
     * Space complexity: O(1).
     * This approach uses linear time because we run through input array only once.
     * We also don't need extra space to store any values, we just use primitive types to collect needed information.
     */
    public static int findMissingNumber(int[] inputArray) {
        int min = Integer.MAX_VALUE;

        int inputElementsXOR = 0;

        for (int x : inputArray) {
            min = Math.min(min, x);
            inputElementsXOR ^= x;
        }

        int requiredXOR = 0;

        for (int i = 0; i < inputArray.length + 1; i++) {
            requiredXOR ^= (min + i);
        }

        return inputElementsXOR ^ requiredXOR;
    }

    private MissingNumberFinder() {
    }
}
