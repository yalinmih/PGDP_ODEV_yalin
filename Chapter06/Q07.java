package odevler.chapter02.Chapter06;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested: ");
        double amount = input.nextDouble();

        System.out.print("Annual interest rate: ");
        double rate = input.nextDouble();

        System.out.printf("%-10s%-10s\n", "Years", "Future Value");

        for (int i = 1; i <= 30; i++) {
            double futureValue = futureInvestmentValue(amount, rate, i);
            System.out.printf("%-10d%-10.2f\n", i, futureValue);
        }
    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + (monthlyInterestRate / 1200), years * 12);
    }
}
