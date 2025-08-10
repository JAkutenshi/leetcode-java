package com.github.jakutenshi.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Problem15ThreeSumTest {
    private Problem15ThreeSum solver;

    @BeforeEach
    void beforeEach() {
        solver = new Problem15ThreeSum();
    }

    @Test
    void example1() {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        var expected = List.of(List.of(-1, -1, 2), List.of(-1, 0, 1));
        assertEquals(expected, solver.threeSum(nums));
    }

    @Test
    void example2() {
        int[] nums = { 0, 1, 1 };
        var expected = List.of();
        assertEquals(expected, solver.threeSum(nums));
    }

    @Test
    void example3() {
        int[] nums = { 0, 0, 0 };
        var expected = List.of(List.of(0, 0, 0));
        assertEquals(expected, solver.threeSum(nums));
    }
}
