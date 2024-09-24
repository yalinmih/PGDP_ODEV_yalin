package odevler.chapter02.Chapter08;

import java.util.Arrays;

public class Q22 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }

        for (int[] rows : matrix) {
            System.out.println(Arrays.toString(rows));
        }

        if (checkRows(matrix) && checkColumns(matrix)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean checkRows(int[][] matrix) {
        int count;
        for (int i = 0; i < matrix.length; i++) {
            count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkColumns(int[][] matrix) {
        int count;
        for (int i = 0; i < matrix[0].length; i++) {
            count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
