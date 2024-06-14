package odevler.chapter02.Chapter03;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remaining = (int)(amount * 100);
        int oneDollars = remaining / 100;
        remaining = remaining % 100;
        int quarters = remaining / 25;
        remaining = remaining % 25;
        int dimes = remaining / 10;
        remaining = remaining % 10;
        int nickels = remaining / 5;
        remaining = remaining % 5;
        int pennies = remaining;

        if (oneDollars > 0) {
            System.out.println(oneDollars + " " + (oneDollars == 1 ? "dollar" : "dollars"));
        }
        if (quarters > 0) {
            System.out.println(quarters + " " + (quarters == 1 ? "quarter" : "quarters"));
        }
        if (dimes > 0) {
            System.out.println(dimes + " " + (dimes == 1 ? "dime" : "dimes"));
        }
        if (nickels > 0) {
            System.out.println(nickels + " " + "nickel");
        }
        if (pennies > 0) {
            System.out.println(pennies + " " + (pennies == 1 ? "penny" : "pennies"));
        }
    }
}
