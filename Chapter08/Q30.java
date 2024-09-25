package odevler.chapter02.Chapter08;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] aValues = new double[2][2];
        double[] bValues = new double[2];

        System.out.print("Enter a values: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                aValues[i][j] = input.nextDouble();
            }
        }
        System.out.print("Enter b values: ");
        for (int i = 0; i < 2; i++) {
            bValues[i] = input.nextDouble();
        }

        double[] result = linearEquation(aValues, bValues);

        if (result == null) {
            System.out.println("The equation has no solution");
        } else {
            System.out.println("X is " + result[0] + " and Y is " + result[1]);
        }

    }

    public static double[] linearEquation(double[][] a, double[] b) {
        double value = a[0][0] * a[1][1] - a[0][1] * a[1][0];

        if (value == 0) {
            return null;
        }
        double x = (b[0] * a[1][1] - b[1] * a[0][1]) / value;
        double y = (b[1] * a[0][0] - b[0] * a[1][0]) / value;

        return new double[]{x, y};
    }
}
