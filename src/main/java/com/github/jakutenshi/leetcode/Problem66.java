package com.github.jakutenshi.leetcode;

public class Problem66 {
    public static int[] plusOne(int[] digits) {
        final var lastDigitPlace = digits.length - 1;
        // making increment for the first digit
        var sum =  digits[lastDigitPlace] + 1;
        var overflow = sum / 10;
        digits[lastDigitPlace] = sum % 10;
        // making increment for rest digits
        for (int currentDigitPlace = lastDigitPlace - 1; currentDigitPlace >= 0 ; currentDigitPlace--) {
            if (overflow == 0) {
                break;
            }
            sum = digits[currentDigitPlace] + overflow;
            digits[currentDigitPlace] = sum % 10;
            overflow = sum / 10;
        }
        // extend the array if overflow still isn't 0
        if (overflow != 0) {
            var extendedDigits = new int[digits.length + 1];
            extendedDigits[0] = overflow;
            System.arraycopy(digits, 0, extendedDigits, 1, extendedDigits.length - 1);
            return extendedDigits;
        }
        return digits;
    }
}
