package odevler.chapter02.Chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.println("The column-sorted array is");
        double[][] sorted = sortColumns(matrix);

        for (int i = 0; i < sorted.length; i++) {
            for (int j = 0; j < sorted[i].length; j++) {
                System.out.print(sorted[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] sortColumns(double[][] m) {
        double[][] sorted = new double[m.length][m[0].length];

        System.arraycopy(m, 0, sorted, 0, m.length);

        for (int col = 0; col < m[0].length; col++) {
            double[] column = new double[m.length];
            for (int i = 0; i < m.length; i++) {
                column[i] = sorted[i][col];
            }
            Arrays.sort(column);

            for (int i = 0; i < m.length; i++) {
                sorted[i][col] = column[i];
            }
        }
        return sorted;
    }
}
