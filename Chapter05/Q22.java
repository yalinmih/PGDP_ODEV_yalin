package odevler.chapter02.Chapter05;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double amount = input.nextDouble();

        System.out.print("Number of Years: ");
        int year = input.nextInt();

        System.out.print("Annual Interest Rate: ");
        double interestRate = input.nextDouble();

        double monthlyRate = interestRate / 1200;
        double monthly = amount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, year * 12));
        double total = monthly * year * 12;

        System.out.printf("Monthly Payment: %.2f\n", monthly);
        System.out.printf("Total Payment: %.2f\n", total);

        System.out.printf("%-17s%-22s%-22s%-22s\n", "Payment#",
                "Interest", "Principal", "Balance");

        double balance = amount;

        for (int i = 1; i <= year * 12; i++) {
            double interest = monthlyRate * balance;
            double principal = monthly - interest;
            balance -= principal;
            System.out.printf("%-17d%-22.2f%-22.2f%-22.2f\n", i, interest, principal, balance);
        }
    }
}
