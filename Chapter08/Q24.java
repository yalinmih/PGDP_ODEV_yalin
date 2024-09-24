package odevler.chapter02.Chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        int[][] grid = readASolution();

        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
    }

    public static int[][] readASolution() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = input.nextInt();
            }
        }
        return grid;
    }

    public static boolean isValid(int[][] grid) {
        return areAllRowsValid(grid) && areAllColumnsValid(grid) && areAllBoxesValid(grid);
    }

    public static boolean areAllRowsValid(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            if (!is1To9(grid[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean areAllColumnsValid(int[][] grid) {
        for (int j = 0; j < 9; j++) {
            int[] column = new int[9];
            for (int i = 0; i < 9; i++) {
                column[i] = grid[i][j];
            }
            if (!is1To9(column)) {
                return false;
            }
        }
        return true;
    }

    public static boolean areAllBoxesValid(int[][] grid) {
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                if (!isBoxValid(grid, boxRow * 3, boxCol * 3)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isBoxValid(int[][] grid, int startRow, int startCol) {
        int[] box = new int[9];
        int k = 0;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                box[k++] = grid[i][j];
            }
        }
        return is1To9(box);
    }

    public static boolean is1To9(int[] list) {
        int[] temp = list.clone();
        Arrays.sort(temp);
        for (int i = 0; i < 9; i++) {
            if (temp[i] != i + 1) {
                return false;
            }
        }
        return true;
    }
}
