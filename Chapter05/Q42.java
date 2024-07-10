package odevler.chapter02.Chapter05;

import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the commission sought: ");
        double COMMISSION_SOUGHT = input.nextDouble();

        double salesAmount;
        double earned;

        for (salesAmount = 0.0; ; salesAmount += 1.0) {
            if (salesAmount <= 5000) {
                earned = salesAmount * 0.08;
            } else if (salesAmount <= 10000) {
                earned = 5000 * 0.08 + (salesAmount - 5000) * 0.1;
            } else {
                earned = 5000 * 0.08 + 5000 * 0.1 + (salesAmount - 10000) * 0.12;
            }
            if (earned >= COMMISSION_SOUGHT) {
                break;
            }
        }
        System.out.println("The min amount: " + salesAmount);
    }
}
