package com.github.jakutenshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class Problem15ThreeSum {
    private final List<List<Integer>> answers = new ArrayList<>();
    private int[] sortedNums;

    public List<List<Integer>> threeSum(int[] nums) {
        // Step 0. Guard
        if (nums.length < 3) {
            return List.of();
        }

        // Step 1. Sort the array that makes negatives first 
        // O(n log n)
        sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);

        // Step 2. Then fix -negative as target and solve Sum II with this target
        // O (n^2)
        int nonPositiveTargetIdx = 0;
        int nonPositiveTarget = sortedNums[nonPositiveTargetIdx];

        // We move target until it non-positive or more or equal of 2 numbers left in the tail
        while (nonPositiveTarget <= 0 && nonPositiveTargetIdx < sortedNums.length - 2) {
            findTwoSums(-nonPositiveTarget, nonPositiveTargetIdx + 1);
            
            nonPositiveTargetIdx = findNextUniqueValueIdx(nonPositiveTargetIdx, nonPositiveTarget);
            nonPositiveTarget = sortedNums[nonPositiveTargetIdx];
        }

        return answers;
    }

    private void findTwoSums(int target, int leftIdx) {
        int rightIdx = sortedNums.length - 1;

        while (leftIdx < rightIdx) {
            int leftValue = sortedNums[leftIdx];
            int rightValue = sortedNums[rightIdx];
            int sum = leftValue + rightValue;

            if (sum == target) {
                answers.add(List.of(-target, leftValue, rightValue));

                // Move left idx to search for next triplets
                leftIdx = findNextUniqueValueIdx(leftIdx, leftValue);
            } else if (sum < target) {
                leftIdx = findNextUniqueValueIdx(leftIdx, leftValue);
            } else if (sum > target) {
                rightIdx = findPrevUniqueValueIdx(rightIdx, rightValue);
            }
        }
    }

    private int shiftUntilUnique(int currentValueIdx, int currentValue, IntFunction<Integer> idxShiftUpdater) {
        int nextUniqueValueIdx = idxShiftUpdater.apply(currentValueIdx);

        while (isInBounds(nextUniqueValueIdx) && sortedNums[nextUniqueValueIdx] == currentValue) {
            int nextIdx = idxShiftUpdater.apply(nextUniqueValueIdx);

            if (!isInBounds(nextIdx)) {
                return nextUniqueValueIdx;
            } else {
                nextUniqueValueIdx = nextIdx;
            }
        }

        return nextUniqueValueIdx;
    }

    private boolean isInBounds(int idx) {
        return 0 <= idx && idx < sortedNums.length;
    }

    private int findNextUniqueValueIdx(int currentValueIdx, int currentValue) {
        return shiftUntilUnique(currentValueIdx, currentValue, idx -> idx + 1);
    }


    private int findPrevUniqueValueIdx(int currentValueIdx, int currentValue) {
        return shiftUntilUnique(currentValueIdx, currentValue, idx -> idx - 1);
    }
}
