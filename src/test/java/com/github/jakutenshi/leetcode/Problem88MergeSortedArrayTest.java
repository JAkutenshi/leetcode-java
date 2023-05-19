package com.github.jakutenshi.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem88MergeSortedArrayTest {

    @Test
    void example1() {
        var nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        var m = 3;
        var nums2 = new int[] { 2, 5, 6 };
        var n = 3;
        var expectedNums1 = new int[] { 1, 2, 2, 3, 5, 6 };
        Problem88MergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(expectedNums1, nums1);
    }

    @Test
    void example2() {
        var nums1 = new int[] { 1 };
        var m = 1;
        var nums2 = new int[] {   };
        var n = 0;
        var expectedNums1 = new int[] { 1 };
        Problem88MergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(expectedNums1, nums1);
    }

    @Test
    void example3() {
        var nums1 = new int[] { 0 };
        var m = 0;
        var nums2 = new int[] { 1 };
        var n = 1;
        var expectedNums1 = new int[] { 1 };
        Problem88MergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(expectedNums1, nums1);
    }
}