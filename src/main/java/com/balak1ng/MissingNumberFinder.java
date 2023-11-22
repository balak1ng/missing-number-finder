package com.balak1ng;

/**
 * Given array of sequent numbers 0,1,2,3...N with a single missing member.
 * Function finds a first missing number occurrence in the sequence.
 * This function is written using constraints (we are not using any validator):
 * 1) Every number in the input array is a non-negative integer.
 * 2) Every number in the input array is unique.
 * 3) Every number in the input array is in range [X ; X + N], where N = inputArray.length.
 * 4) There is only one missing number in the input array.
 * 4.1) If input array contains all sequent numbers from X to X + N, then the missing number will be X - 1.
 * 4.2) If X - 1 < 0 then we return X + N + 1.
 */
public class MissingNumberFinder {
    /**
     * The problem can be solved with using of sum of arithmetic progression formula.
     * First of all we find the smallest element of input array and count sum of all it's elements.
     * Then we calculate the required sum according to the formula using found small element.
     * I case we have all elements represented -> returning the previous one which is 'out of bounds'.
     * This works only if the smallest element is bigger than zero.
     * In other case we just calculate difference between both calculated sums and return the answer.
     * Time complexity: O(n), n = inputArray.length.
     * Space complexity: O(1).
     * This approach uses linear time because we run through input array only once.
     * We also don't need extra space to store any values, we just use primitive types to collect needed information.
     */
    public static int findMissingNumber(int[] inputArray) {
        int min = Integer.MAX_VALUE;
        int n = inputArray.length;

        long currentSum = 0;

        for (int x : inputArray) {
            min = Math.min(min, x);
            currentSum += x;
        }

        long requiredSum = (2 * (long) min + n) * (n + 1) / 2;

        if (min > 0 && requiredSum - currentSum == min + n) {
            return min - 1;
        }

        return (int) (requiredSum - currentSum);
    }

    private MissingNumberFinder() {
    }
}
