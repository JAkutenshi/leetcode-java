package com.github.jakutenshi.leetcode;

public class Problem28FindIndexOfFirstOccurrenceInString {
    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }

        var lastPossibleIndexValue = haystack.length() - needle.length();
        for (int i = 0; i <= lastPossibleIndexValue; i++) {
            if (isSubstringByIndex(i, haystack, needle)) {
                return i;
            }
        }

        return -1;
    }

    private static boolean isSubstringByIndex(int index, String haystack, String needle) {
        for (int j = 0; j < needle.length(); j++) {
            if (haystack.charAt(index + j) != needle.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
