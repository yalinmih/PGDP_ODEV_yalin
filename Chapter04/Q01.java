package odevler.chapter02.Chapter04;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double length = input.nextDouble();

        double side = 2 * length * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
        String formattedArea = String.format("%.2f", area); // virgülden sonra 2 sayı bırakmaya yarıyor.

        System.out.println("The area of the pentagon is " + formattedArea);
    }
}
