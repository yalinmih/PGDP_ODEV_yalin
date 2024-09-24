package odevler.chapter02.Chapter08;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[6][6];

        System.out.println("Enter a 6-by-6 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int count;
        int indexRow = -1;
        for (int i = 0; i < matrix.length; i++) {
            count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                indexRow = i;
            }
        }

        int indexCol = -1;
        for (int i = 0; i < matrix[0].length; i++) {
            count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                indexCol = i;
            }
        }
        System.out.println("The flipped cell is at (" + indexRow + ", " + indexCol + ")");
    }
}
