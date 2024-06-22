package odevler.chapter02.Chapter03;

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double result = (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1);

        if (result > 0) {
            System.out.println("(" + x3 + ", " + y3 + ") is on the left side of the line from (" +
                    x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");
        } else if (result == 0) {
            System.out.println("(" + x3 + ", " + y3 + ") is on the line from (" +
                    x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");
        } else {
            System.out.println("(" + x3 + ", " + y3 + ") is on the right side of the line from (" +
                    x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");
        }
    }
}
