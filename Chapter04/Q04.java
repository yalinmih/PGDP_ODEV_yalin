package odevler.chapter02.Chapter04;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
        String formattedArea = String.format("%.2f",area);

        System.out.println("The area of the hexagon is " + formattedArea);
    }
}
