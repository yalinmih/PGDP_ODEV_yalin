package odevler.chapter02.Chapter03;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int convert = input.nextInt();

        if (convert == 0) {
            System.out.print("Enter the dollar amount: ");
            double dollar = input.nextDouble();
            System.out.println("$" + dollar + " is " + (rate * dollar) + " yuan");
        } else if (convert == 1) {
            System.out.print("Enter the RMB amount: ");
            double rmb = input.nextDouble();
            System.out.println(rmb + " yuan is $" + (rmb / rate));
        } else {
            System.out.println("Incorrect input");
        }
    }
}
