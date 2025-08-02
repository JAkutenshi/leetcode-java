package com.github.jakutenshi.leetcode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Problem36ValidSudokuTest {
    private Problem36ValidSudoku sudokuSolver;

    @BeforeEach
    void beforeEach() {
        sudokuSolver = new Problem36ValidSudoku();
    }

    @Test
    void example1() {
        final char[][] input = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        assertTrue(sudokuSolver.isValidSudoku(input));
    }

    @Test
    void example2() {
        final char[][] input = {
            {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        assertFalse(sudokuSolver.isValidSudoku(input));
    }

    @Test
    void test482() {
        final char[][] input = {
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'}, 
            {'.', '.', '.', '.', '.', '.', '3', '.', '.'}, 
            {'.', '.', '.', '1', '8', '.', '.', '.', '.'}, 
            {'.', '.', '.', '7', '.', '.', '.', '.', '.'}, 
            {'.', '.', '.', '.', '1', '.', '9', '7', '.'}, 
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'}, 
            {'.', '.', '.', '3', '6', '.', '1', '.', '.'}, 
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'}, 
            {'.', '.', '.', '.', '.', '.', '.', '2', '.'}
        };

        assertTrue(sudokuSolver.isValidSudoku(input));
    }
}
