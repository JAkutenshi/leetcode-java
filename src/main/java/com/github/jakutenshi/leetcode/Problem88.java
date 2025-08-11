package com.github.jakutenshi.leetcode;

public class Problem88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1 have a zeroes suffix => we can start merging from greater number and put them to the nums1's end
        int nums2lastIdx = n - 1;
        int nums1lastIdx = m - 1;
        int resultNumsIdx = nums1.length - 1;
        while (nums2lastIdx >= 0) {
            if (nums1lastIdx < 0 || nums2[nums2lastIdx] >= nums1[nums1lastIdx]) {
                nums1[resultNumsIdx] = nums2[nums2lastIdx];
                nums2lastIdx--;
            } else {
                nums1[resultNumsIdx] = nums1[nums1lastIdx];
                nums1lastIdx--;
            }
            resultNumsIdx--;
        }
    }
}
