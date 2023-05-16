package com.github.jakutenshi.leetcode;

import org.junit.jupiter.api.Test;

import static com.github.jakutenshi.leetcode.Problem66PlusOne.plusOne;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem66PlusOneTest {

    @Test
    void example1() {
        var inputDigits = new int[] { 1, 2, 3 };
        var expectedDigits = new int[] { 1, 2, 4  };
        assertArrayEquals(expectedDigits, plusOne(inputDigits));
    }

    @Test
    void example2() {
        var inputDigits = new int[] { 4, 3, 2, 1 };
        var expectedDigits = new int[] { 4, 3, 2, 2 };
        assertArrayEquals(expectedDigits, plusOne(inputDigits));
    }

    @Test
    void example3() {
        var inputDigits = new int[] { 9 };
        var expectedDigits = new int[] { 1, 0 };
        assertArrayEquals(expectedDigits, plusOne(inputDigits));
    }

    @Test
    void digits99Case() {
        var inputDigits = new int[] { 9, 9 };
        var expectedDigits = new int[] { 1, 0, 0 };
        assertArrayEquals(expectedDigits, plusOne(inputDigits));
    }

}