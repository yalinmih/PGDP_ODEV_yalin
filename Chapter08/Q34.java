package odevler.chapter02.Chapter08;

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[6][2];
        System.out.print("Enter 6 points: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        double[] result = getRightmostLowestPoint(points);
        System.out.println("The rightmost lowest point is (" + result[0] + ", " + result[1] + ")");
    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        double[] rightmostLowest = points[0];

        for (int i = 1; i < points.length; i++) {
            if (points[i][1] < rightmostLowest[1]) {
                rightmostLowest = points[i];
            } else if (points[i][1] == rightmostLowest[1] && points[i][0] > rightmostLowest[0]) {
                rightmostLowest = points[i];
            }
        }
        return rightmostLowest; // en düşük y değerini alır, eğer eşit y değerleri varsa x değeri yüksek olanı alır.
    }
}
