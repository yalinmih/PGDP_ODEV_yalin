package odevler.chapter02.Chapter08;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        if(isMarkovMatrix(matrix)) {
            System.out.println("It is a Markov matrix");
        } else {
            System.out.println("It is not a Markov matrix");
        }
    }
    public static boolean isMarkovMatrix(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] < 0 || m[i][j] > 1) {
                    return false;
                }
            }
        }
        double sum;
        for (int col = 0; col < m[0].length; col++) {
            sum = 0;
            for (int row = 0; row < m.length; row++) {
                sum += m[row][col];
            }
            if (sum != 1) {
                return false;
            }
        }
        return true;
    }
}
