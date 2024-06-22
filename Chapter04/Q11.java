package odevler.chapter02.Chapter04;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int value = input.nextInt();

        if (value < 0 || value > 15) {
            System.out.println(value + " is an invalid input");
        } else {
            String result = switch (value) {
                case 10 -> "A";
                case 11 -> "B";
                case 12 -> "C";
                case 13 -> "D";
                case 14 -> "E";
                case 15 -> "F";
                default -> Integer.toString(value);
            };
            System.out.println("The hex value is " + result);
        }
    }
}
