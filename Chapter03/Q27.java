package odevler.chapter02.Chapter03;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double x1 = 0;
        double y1 = 0;
        double x2 = 200;
        double y2 = 0;
        double x3 = 0;
        double y3 = 100;

        double areaTotal = areaCalc(x1, y1, x2, y2, x3, y3);
        double area1 = areaCalc(x, y, x2, y2, x3, y3);
        double area2 = areaCalc(x1, y1, x, y, x3, y3);
        double area3 = areaCalc(x1, y1, x2, y2, x, y);

        boolean isInside = (area1 + area2 + area3 == areaTotal);

        if (isInside) {
            System.out.println("The point (" + x + ", " + y + ") is inside the triangle.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is outside the triangle.");
        }
    }
    public static double areaCalc(double x1, double y1, double x2, double y2, double x3, double y3) {
        return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
    }
}
