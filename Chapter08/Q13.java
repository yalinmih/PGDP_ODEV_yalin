package odevler.chapter02.Chapter08;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        double[][] matrix = new double[rows][columns];

        System.out.println("Enter the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        int[] index = locateLargest(matrix);

        System.out.println("The location of the largest element is at (" + index[0] + ", " + index[1] + ")");

    }
    public static int[] locateLargest(double[][] a) {
        double max = Double.NEGATIVE_INFINITY;
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        return new int[]{maxRow, maxCol};
    }
}
