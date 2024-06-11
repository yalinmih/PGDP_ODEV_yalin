package odevler.chapter02.Chapter02;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investment = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterest = input.nextDouble();
        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double value = investment * Math.pow(1 + (annualInterest / 1200), years * 12);
        System.out.println("Accumulated value is " + value);
    }
}
