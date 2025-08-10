package com.github.jakutenshi.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem347TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> histogram = new HashMap<>();

        // Step 1 make the histogram O(n)
        Arrays
        .stream(nums)
            .forEach(n -> histogram.put(
                n, 
                histogram.computeIfAbsent(
                    n, 
                    ignore -> 1
                ) + 1
            ));

        // Step 2 sort O(n log n)
        int numbersCount = histogram.values().size();
        IntPair[] freqs = new IntPair[numbersCount];

        {
            int idx = 0;

            for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
                freqs[idx++] = new IntPair(entry.getKey(), entry.getValue());
            }

            Arrays.sort(freqs);
        }

        // Step 3 get top K numbers as the result
        int[] resultNums = new int[k];
        
        for (int idx = 0; idx < k; idx++) {
            resultNums[idx] = freqs[idx].getNumber();
        }

        return resultNums;
    }


    private static class IntPair implements Comparable<IntPair> {
        private final int number;
        private final int frequency;

        public IntPair(int number, int frequency) {
            this.number = number;
            this.frequency = frequency;
        }

        public int getNumber() {
            return number;
        }

        @Override
        public int compareTo(IntPair o) {
            if (o == null) {
                return -1;
            }

            return o.frequency - this.frequency;
        }
    };
}
