package odevler.chapter02.Chapter02;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double annualInterest = input.nextDouble();

        double interest = balance * (annualInterest / 1200);
        System.out.println("The interest is " + interest);


    }
}
