package com.github.jakutenshi.leetcode;

public class Problem11 {
    public int maxArea(int[] height) {
        int leftIdx = 0;
        int rightIdx = height.length - 1;

        int maxArea = Integer.MIN_VALUE;
        
        while (leftIdx < rightIdx) {
            int leftHeight = height[leftIdx];
            int rightHeight = height[rightIdx];

            int area = (rightIdx - leftIdx);

            if (leftHeight < rightHeight) {
                area *= leftHeight;

                leftIdx++;
            } else {
                area *= rightHeight;

                rightIdx--;
            }

            if (maxArea < area) {
                maxArea = area;
            }
        }

        return maxArea;
    }
}
