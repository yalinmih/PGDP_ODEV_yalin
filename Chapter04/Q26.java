package odevler.chapter02.Chapter04;

import java.util.Scanner;

//chatGPT yardımı ile

public class Q26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        String amount = input.next();

        int decimalPosition = amount.indexOf('.');

        int dollars = Integer.parseInt(amount.substring(0, decimalPosition));
        int cents = Integer.parseInt(amount.substring(decimalPosition + 1));

        int numberOfQuarters = cents / 25;
        cents = cents % 25;

        int numberOfDimes = cents / 10;
        cents = cents % 10;

        int numberOfNickels = cents / 5;
        cents = cents % 5;

        int numberOfPennies = cents;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + dollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}

