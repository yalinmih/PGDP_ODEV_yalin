package odevler.chapter02.Chapter06;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        double number1 = input.nextDouble();

        System.out.print("Enter an integer: ");
        double number2 = input.nextDouble();

        System.out.print("Enter an integer: ");
        double number3 = input.nextDouble();

        displaySortedNumbers(number1, number2, number3);
    }
    public static void displaySortedNumbers( double num1, double num2, double num3) {
        double temp;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("Order: " + num1 + ", " + num2 + ", " + num3);
    }
}
