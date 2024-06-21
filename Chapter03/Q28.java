package odevler.chapter02.Chapter03;

import java.util.Scanner;

// chatGPT yardımı ile

public class Q28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double r1x = input.nextDouble();
        double r1y = input.nextDouble();
        double r1Width = input.nextDouble();
        double r1Height = input.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double r2x = input.nextDouble();
        double r2y = input.nextDouble();
        double r2Width = input.nextDouble();
        double r2Height = input.nextDouble();

        boolean inside = r2x + r2Width / 2 <= r1x + r1Width / 2 && r2x - r2Width / 2 >= r1x - r1Width / 2 &&
                        r2y + r2Height / 2 <= r1y + r1Height / 2 && r2y - r2Height / 2 >= r1y - r1Height / 2;

        boolean overlap =
                r1x + r1Width / 2 >= r2x - r2Width / 2 && r1x - r1Width / 2 <= r2x + r2Width / 2 &&
                        r1y + r1Height / 2 >= r2y - r2Height / 2 && r1y - r1Height / 2 <= r2y + r2Height / 2;

        if (inside) {
            System.out.println("r2 is inside r1");
        } else if (overlap) {
            System.out.println("r2 overlaps r1");
        } else {
            System.out.println("r2 does not overlap r1");
        }
    }
}
