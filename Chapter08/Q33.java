package odevler.chapter02.Chapter08;

//sonuç yanlış çıkıyor mutlaka sor!

import java.util.Arrays;
import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] p = new double[4][2];

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[0].length; j++) {
                p[i][j] = input.nextDouble();
            }
        }
        double area1 = calculateArea(p[0][0], p[0][1], p[1][0], p[1][1], p[2][0], p[2][1]);
        double area2 = calculateArea(p[0][0], p[0][1], p[2][0], p[2][1], p[3][0], p[3][1]);
        double area3 = calculateArea(p[0][0], p[0][1], p[1][0], p[1][1], p[3][0], p[3][1]);
        double area4 = calculateArea(p[1][0], p[1][1], p[2][0], p[2][1], p[3][0], p[3][1]);

        double[] allAreas = {area1, area2, area3, area4};

        Arrays.sort(allAreas);

        System.out.println("The areas are " + allAreas[0] + " " + allAreas[1] + " " + allAreas[2] + " " + allAreas[3]);
    }
    public static double calculateArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
    }
}