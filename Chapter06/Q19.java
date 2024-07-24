package odevler.chapter02.Chapter06;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side1: ");
        double side1 = input.nextDouble();

        System.out.print("Enter side2: ");
        double side2 = input.nextDouble();

        System.out.print("Enter side3: ");
        double side3 = input.nextDouble();

        if (isValid(side1, side2, side3)) {
            System.out.println(area(side1, side2, side3));
        } else {
            System.out.println("Input is invalid.");
        }
    }

    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3) || (side1 + side3 > side1) || (side3 + side2 > side1);
    }

    public static double area(double side1, double side2, double side3) {
        double side = (side1 + side2 + side3) / 2;

        return Math.sqrt(side * (side - side1) * (side - side2) * (side - side3));
    }
}
