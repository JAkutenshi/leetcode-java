package com.github.jakutenshi.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Problem347Test {
    private Problem347 solver;

    @BeforeEach
    void beforeEach() {
        solver = new Problem347();
    }

    @Test
    void example1() {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;

        int[] expected = { 1, 2 };

        assertArrayEquals(expected, solver.topKFrequent(nums, k));
    }

    @Test
    void example2() {
        int[] nums = { 1 };
        int k = 1;

        int[] expected = { 1 };

        assertArrayEquals(expected, solver.topKFrequent(nums, k));
    }
}
