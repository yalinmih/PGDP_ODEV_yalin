package odevler.chapter02.Chapter08;

//chatgpt yardımı ile

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        boolean rowFound = checkRows(matrix, size);
        boolean columnFound = checkColumns(matrix, size);
        boolean diagonalFound = checkDiagonals(matrix, size);

        if (!rowFound) {
            System.out.println("No same numbers on a row");
        }
        if (!columnFound) {
            System.out.println("No same numbers on a column");
        }
        if (!diagonalFound) {
            System.out.println("No same numbers on the major diagonal");
            System.out.println("No same numbers on the sub-diagonal");
        }
    }

    public static boolean checkRows(int[][] matrix, int size) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            boolean same = true;
            int firstElement = matrix[i][0];
            for (int j = 1; j < size; j++) {
                if (matrix[i][j] != firstElement) {
                    same = false;
                    break;
                }
            }
            if (same) {
                System.out.println("All " + firstElement + "s on row " + i);
                found = true;
            }
        }
        return found;
    }

    public static boolean checkColumns(int[][] matrix, int size) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            boolean same = true;
            int firstElement = matrix[0][i];
            for (int j = 1; j < size; j++) {
                if (matrix[j][i] != firstElement) {
                    same = false;
                    break;
                }
            }
            if (same) {
                System.out.println("All " + firstElement + "s on column " + i);
                found = true;
            }
        }
        return found;
    }

    public static boolean checkDiagonals(int[][] matrix, int size) {
        boolean found = false;

        boolean sameMajor = true;
        int firstElementMajor = matrix[0][0];
        for (int i = 1; i < size; i++) {
            if (matrix[i][i] != firstElementMajor) {
                sameMajor = false;
                break;
            }
        }
        if (sameMajor) {
            System.out.println("All " + firstElementMajor + "s on the major diagonal");
            found = true;
        }

        boolean allSub = true;
        int firstElementSub = matrix[0][size - 1];
        for (int i = 1; i < size; i++) {
            if (matrix[i][size - 1 - i] != firstElementSub) {
                allSub = false;
                break;
            }
        }
        if (allSub) {
            System.out.println("All " + firstElementSub + "s on the sub-diagonal");
            found = true;
        }
        return found;
    }
}

