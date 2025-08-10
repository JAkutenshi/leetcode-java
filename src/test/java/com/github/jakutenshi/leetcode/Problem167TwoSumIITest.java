package com.github.jakutenshi.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Problem167TwoSumIITest {
    private Problem167TwoSumII solver;

    @BeforeEach
    void beforeEach() {
        solver = new Problem167TwoSumII();
    }

    @Test
    void example1() {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, solver.twoSum(numbers, target));
    }

    @Test
    void example2() {
        int[] numbers = { 2, 3, 4 };
        int target = 6;
        int[] expected = { 1, 3 };
        assertArrayEquals(expected, solver.twoSum(numbers, target));
    }

    @Test
    void example3() {
        int[] numbers = { -1, 0 };
        int target = -1;
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, solver.twoSum(numbers, target));
    }
}
