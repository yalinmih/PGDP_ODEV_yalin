package odevler.chapter02.Chapter06;

import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int sidesNum = input.nextInt();

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double result = area(sidesNum, side);
        System.out.println("The area of the polygon is " + result);
    }

    public static double area(int n, double side) {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
