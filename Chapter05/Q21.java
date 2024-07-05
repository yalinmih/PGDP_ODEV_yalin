package odevler.chapter02.Chapter05;

import java.util.Scanner;
//ComputeLoan
public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        int amount = input.nextInt();

        System.out.print("Number of Years: ");
        int year = input.nextInt();

        System.out.printf("%-22s%-22s%-22s\n", "Interest Rate", "Monthly Payment", "Total Payment");

        for (double rate = 5.0; rate <= 8.0; rate += 0.125) {
            double monthlyRate = rate / 1200;
            double monthly = amount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, year * 12));
            double total = monthly * year * 12;

            System.out.printf("%-22.3f%-22.2f%-22.2f\n", rate, monthly, total);
        }
    }
}
