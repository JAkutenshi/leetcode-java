package com.github.jakutenshi.leetcode;

public class Problem167TwoSumII {
    public int[] twoSum(int[] numbers, int target) {    
        int leftIdx = 0;
        int rightIdx = numbers.length - 1;

        // We have the guarantee of a solution so break op will be called
        while (leftIdx < rightIdx) {
            int sum = numbers[leftIdx] + numbers[rightIdx];
            
            if (sum == target) {
                break;
            } else if (sum < target) { // Left pointer moving right is increasing the sum
                leftIdx++;
            } else { // Otherwhise the right pointer moving left is decreasing the sum
                rightIdx--; System.out.println(".()");
            }
        }

        return new int[] { leftIdx + 1, rightIdx + 1 };
    }
}
