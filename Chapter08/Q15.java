package odevler.chapter02.Chapter08;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] array = new double[5][2];

        System.out.print("Enter five points: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        if (sameLine(array)) {
            System.out.println("The five points are on the same line");
        } else {
            System.out.println("The five points are not on the same line");
        }
    }

    public static boolean sameLine(double[][] points) {
        for (int i = 2; i < points.length; i++) {
            double x1 = points[0][0], y1 = points[0][1];
            double x2 = points[1][0], y2 = points[1][1];
            double x3 = points[i][0], y3 = points[i][1];

            if (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2) != 0) {
                return false;
            }
        }
        return true;
    }
}
