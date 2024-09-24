package odevler.chapter02.Chapter08;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        if (isConsecutiveFour(matrix)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean isConsecutiveFour(int[][] values) {
        int rows = values.length;
        int cols = values[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols - 3; j++) {
                if (values[i][j] == values[i][j + 1] &&
                        values[i][j] == values[i][j + 2] &&
                        values[i][j] == values[i][j + 3]) {
                    return true;
                }
            }
        }

        for (int i = 0; i < rows - 3; i++) {
            for (int j = 0; j < cols; j++) {
                if (values[i][j] == values[i + 1][j] &&
                        values[i][j] == values[i + 2][j] &&
                        values[i][j] == values[i + 3][j]) {
                    return true;
                }
            }
        }

        for (int i = 0; i < rows - 3; i++) {
            for (int j = 0; j < cols - 3; j++) {
                if (values[i][j] == values[i + 1][j + 1] &&
                        values[i][j] == values[i + 2][j + 2] &&
                        values[i][j] == values[i + 3][j + 3]) {
                    return true;
                }
            }
        }

        for (int i = 0; i < rows - 3; i++) {
            for (int j = 3; j < cols; j++) {
                if (values[i][j] == values[i + 1][j - 1] &&
                        values[i][j] == values[i + 2][j - 2] &&
                        values[i][j] == values[i + 3][j - 3]) {
                    return true;
                }
            }
        }
        return false;
    }
}
