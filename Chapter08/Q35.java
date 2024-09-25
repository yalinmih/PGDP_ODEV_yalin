package odevler.chapter02.Chapter08;

//chatgpt yardımı ile

import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int rows = input.nextInt();

        int[][] matrix = new int[rows][rows];
        System.out.println("Enter the matrix row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        int[] result = findLargestBlock(matrix);
        System.out.println("The maximum square submatrix is at (" + result[0] + ", " + result[1] +
                ") with size " + result[2]);
    }

    public static int[] findLargestBlock(int[][] m) {
        int size = m.length;
        int[][] dp = new int[size][size];

        int maxSize = 0;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (m[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    }
                    if (dp[i][j] > maxSize) {
                        maxSize = dp[i][j];
                        maxRow = i;
                        maxCol = j;
                    }
                }
            }
        }
        return new int[]{maxRow - maxSize + 1, maxRow - maxSize + 1, maxSize};
    }
}
