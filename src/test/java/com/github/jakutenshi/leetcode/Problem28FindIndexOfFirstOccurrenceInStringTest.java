package com.github.jakutenshi.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.github.jakutenshi.leetcode.Problem28FindIndexOfFirstOccurrenceInString.strStr;

class Problem28FindIndexOfFirstOccurrenceInStringTest {

    @Test
    public void example1() {
        var haystack = "sadbutsad";
        var needle = "sad";
        Assertions.assertEquals(0, strStr(haystack, needle));
    }

    @Test
    public void example2() {
        var haystack = "leetcode";
        var needle = "leeto";
        Assertions.assertEquals(-1, strStr(haystack, needle));
    }

    @Test
    public void lastSingleCharacterCase() {
        var haystack = "abc";
        var needle = "c";
        Assertions.assertEquals(2, strStr(haystack, needle));
    }

    @Test
    public void overlappedSubstringsCase() {
        var haystack = "mississippi";
        var needle = "issip";
        Assertions.assertEquals(4, strStr(haystack, needle));
    }
}