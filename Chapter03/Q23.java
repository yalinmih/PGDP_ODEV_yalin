package odevler.chapter02.Chapter03;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if (inRectangle(x, y)) {
            System.out.println("Point " + "(" + x + ", " + y + ") is in the rectangle");
        } else {
            System.out.println("Point " + "(" + x + ", " + y + ") is not in the rectangle");
        }
    }
    public static boolean inRectangle(double x, double y) {
        return (x <= 5 && x >= -5) && (y <= 2.5 && y >= -2.5);
    }
}
