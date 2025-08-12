package com.github.jakutenshi.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Problem155Test {
    private Problem155.MinStack stack;

    @BeforeEach
    void beforeEach() {
        stack = new Problem155.MinStack();
    }

    @Test
    void example() {
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        assertEquals(-3, stack.getMin());
        stack.pop();
        assertEquals(0, stack.top());
        assertEquals(-2, stack.getMin());
    }
    
}
