package odevler.chapter02.Chapter08;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[4][2];
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        double[] result = getIntersectingPoint(points);

        if (result == null) {
            System.out.println("The two lines are parallel");
        } else {
            System.out.printf("The intersecting point is at (%.5f, %.5f)%n", result[0], result[1]);
        }
    }

    public static double[] getIntersectingPoint(double[][] points) {
        double x1 = points[0][0];
        double y1 = points[0][1];
        double x2 = points[1][0];
        double y2 = points[1][1];
        double x3 = points[2][0];
        double y3 = points[2][1];
        double x4 = points[3][0];
        double y4 = points[3][1];

        double a1 = y1 - y2;
        double b1 = x2 - x1;
        double c1 = a1 * x1 + b1 * y1;
        double a2 = y3 - y4;
        double b2 = x4 - x3;
        double c2 = a2 * x3 + b2 * y3;

        double value = a1 * b2 - a2 * b1;

        if (value == 0) {
            return null;
        }
        double intersectX = (b2 * c1 - b1 * c2) / value;
        double intersectY = (a1 * c2 - a2 * c1) / value;

        return new double[]{intersectX, intersectY};
    }
}