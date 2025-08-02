package com.github.jakutenshi.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.UnaryOperator;

public class Problem128LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        // Step 0. Guards
        if (nums.length == 0) { // Empty guard
            return 0;
        } else if (nums.length == 1) { // Fast answer guard
            return 1;
        }

        // Step 1. Remove any duplicates
        // O(n)
        Set<Integer> numsSet = new HashSet<Integer>();
        Arrays.stream(nums).forEach(numsSet::add);

        // Step 2. Lets build sequences moving by the array and if current number is still in the set - start to build
        // a new sequence. New sequence forming eith recursive check of numbers less and more by 1 from the initial one
        // and if numbers are in the set, so remove them and add to the new sequence.
        // O(n)
        Set<Sequence> sequences = new HashSet<>();

        int numIdx = 0;

        do {
            int num = nums[numIdx++];

            boolean isNewSequence = numsSet.remove(num);

            if (!isNewSequence) {
                continue;
            }

            Sequence newSequence = new Sequence(num);

            look(num, n -> n - 1, newSequence, numsSet);
            look(num, n -> n + 1, newSequence, numsSet);

            sequences.add(newSequence);
        // Due to step 1 we have guarantee that we do not overcome nums.length index in array and also have a guarantee
        // that iteration by array with numbers removing will lead to the clean set.
        } while (!numsSet.isEmpty());

        // Step 3. Find the longest size of sequences. In wors case there is N sequences per every number.
        // O(n).
        int maxSize = 0;

        for (Sequence seq : sequences) {
            int size = seq.size();

            if (size > maxSize) {
                maxSize = size;
            }
        };

        return maxSize;
    }

    private static void look(
        int currentNumber,
        UnaryOperator<Integer> differ,
        Sequence sequence, 
        Set<Integer> commonNumbersSet
    ) {
        int neighbour = differ.apply(currentNumber);

        if (commonNumbersSet.remove(neighbour)) {
            sequence.add(neighbour);
            look(neighbour, differ, sequence, commonNumbersSet);
        }
    }

    // Contains numbers with diff equals 1
    private static class Sequence {
        private final Set<Integer> numbers = new HashSet<>();

        public Sequence(int initNumber) {
            numbers.add(initNumber);
        }

        public int size() {
            return numbers.size();
        }

        public void add(int number) {
            numbers.add(number);
        }
    }
}
