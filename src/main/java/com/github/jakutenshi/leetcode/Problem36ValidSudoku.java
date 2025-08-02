package com.github.jakutenshi.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem36ValidSudoku {
    private static final int BOARD_WIDTH = 9;
    private static final int BOARD_HEIGHT = 9;

    private static final int SQUARE_WIDTH = 3;
    private static final int SQUARE_HEIGHT = 3;

    private static final int SQUARES_COUNT = (BOARD_WIDTH * BOARD_HEIGHT) / (SQUARE_WIDTH * SQUARE_HEIGHT);

    private static final char EMPTY_CELL_VALUE = '.';

    private final List<Set<Integer>> columnValidators = new ArrayList<>(BOARD_WIDTH);
    private final List<Set<Integer>> rowValidators    = new ArrayList<>(BOARD_HEIGHT);
    
    private final List<Set<Integer>> squaresValidator = new ArrayList<>(SQUARES_COUNT);
    

    {
        for (int columnIdx = 0; columnIdx < BOARD_WIDTH; columnIdx++) {
            columnValidators.add(columnIdx, new HashSet<Integer>());
        }

        for (int rowIdx = 0; rowIdx < BOARD_HEIGHT; rowIdx++) {
            rowValidators.add(rowIdx, new HashSet<Integer>());
        }

        for (int squareIdx = 0; squareIdx < SQUARES_COUNT; squareIdx++) {
            squaresValidator.add(squareIdx, new HashSet<Integer>());
        }
    }

    public boolean isValidSudoku(char[][] board) {
        for (int rowIdx = 0; rowIdx < BOARD_HEIGHT; rowIdx++) {
            for (int columnIdx = 0; columnIdx < BOARD_WIDTH; columnIdx++) {
                char symbol = board[rowIdx][columnIdx];

                if (symbol == EMPTY_CELL_VALUE) {
                    continue;
                } else {
                    int number = symbol - '0';

                    if (!columnValidators.get(columnIdx).add(number)) {
                        return false;
                    }

                    if (!rowValidators.get(rowIdx).add(number)) {
                        return false;
                    }

                    int squareIdx = rowIdx / SQUARE_HEIGHT * SQUARE_WIDTH + columnIdx / SQUARE_WIDTH;

                    if (!squaresValidator.get(squareIdx).add(number)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
