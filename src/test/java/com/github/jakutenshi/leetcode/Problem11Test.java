package com.github.jakutenshi.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Problem11Test {
    private Problem11 solver;

    @BeforeEach
    void beforeEach() {
        solver = new Problem11();
    }

    @Test
    void example1() {
        int[] heights = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int expected = 49;
        
        assertEquals(expected, solver.maxArea(heights));
    }

    @Test
    void example2() {
        int[] heights = { 1, 1 };
        int expected = 1;
        
        assertEquals(expected, solver.maxArea(heights));
    }
}
