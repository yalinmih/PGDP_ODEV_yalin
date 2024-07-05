package odevler.chapter02.Chapter05;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = input.nextDouble();

        System.out.print("Rate: ");
        double rate = input.nextDouble();

        System.out.print("Months: ");
        int month = input.nextInt();

        double monthlyRate = rate / 1200;
        double totalAmount = 0.0;
        for (int i = 1; i <= month; i++) {
            totalAmount += amount;
            totalAmount *= (1 + monthlyRate);
        }
        System.out.println(totalAmount);
    }
}
