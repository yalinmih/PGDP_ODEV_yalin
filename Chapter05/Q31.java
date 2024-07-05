package odevler.chapter02.Chapter05;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter annual percentage yield: ");
        double annual = input.nextDouble();

        System.out.print("Enter maturity period (number of months): ");
        int month = input.nextInt();

        System.out.printf("%-13s%-13s\n", "Month", "CD Value");

        double total = amount;
        for (int i = 1; i <= month; i++) {
            total += total * annual / 1200;
            String formattedTotal = String.format("%.2f", total);
            System.out.printf("%-13s%-13s\n", i, formattedTotal);
        }
    }
}
