package odevler.chapter02.Chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.println("The row-sorted array is");

        double[][] sorted = sortRows(matrix);
        for (int i = 0; i < sorted.length; i++) {
            for (int j = 0; j < sorted[i].length; j++) {
                System.out.print(sorted[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static double[][] sortRows(double[][] m) {
        double[][] sorted = new double[m.length][m[0].length];

        for (int row = 0; row < m.length; row++) {
            System.arraycopy(m[row], 0, sorted[row], 0, m[row].length);
            Arrays.sort(sorted[row]);
        }
        return sorted;
    }
}

