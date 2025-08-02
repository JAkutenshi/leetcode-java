package com.github.jakutenshi.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Problem128LongestConsecutiveSequenceTest {
    private Problem128LongestConsecutiveSequence problemSolver;

    @BeforeEach
    void beforeEach() {
        problemSolver = new Problem128LongestConsecutiveSequence();
    }

    @Test
    void example1() {
        final int[] input = { 100, 4, 200, 1, 3, 2 };
        final int expectedLength = 4;

        assertEquals(expectedLength, problemSolver.longestConsecutive(input));
    }

    @Test
    void example2() {
        final int[] input = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        final int expectedLength = 9;

        assertEquals(expectedLength, problemSolver.longestConsecutive(input));
    }

    @Test
    void example3() {
        final int[] input = { 1, 0, 1, 2 };
        final int expectedLength = 3;

        assertEquals(expectedLength, problemSolver.longestConsecutive(input));
    }

    @Test
    void test3() {
        final int[] input = { };
        final int expectedLength = 0;

        assertEquals(expectedLength, problemSolver.longestConsecutive(input));
    }
}
