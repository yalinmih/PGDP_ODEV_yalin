package odevler.chapter02.Chapter03;

import java.util.Scanner;

// chatGPT yardımı ile

public class Q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a1 = y1 - y2;
        double b1 = x2 - x1;
        double c1 = a1 * x1 + b1 * y1;
        double a2 = y3 - y4;
        double b2 = x4 - x3;
        double c2 = a2 * x3 + b2 * y3;

        double determinant = a1 * b2 - a2 * b1;

        if (determinant == 0) {
            System.out.println("The two lines are parallel");
        } else {
            double intersectX = (b2 * c1 - b1 * c2) / determinant;
            double intersectY = (a1 * c2 - a2 * c1) / determinant;

            System.out.println("The intersecting point is at (" + intersectX + ", " + intersectY + ")");
        }
    }
}
