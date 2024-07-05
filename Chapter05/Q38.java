package odevler.chapter02.Chapter05;

import java.util.Scanner;
//chatGPT yardımı ile

public class Q38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();

        String octal;

        if (decimal == 0) {
            octal = "0";
        } else {
            StringBuilder octalBuilder = new StringBuilder();
            int temp = decimal;

            while (temp != 0) {
                int remainder = temp % 8;
                octalBuilder.insert(0, remainder);
                temp /= 8;
            }

            octal = octalBuilder.toString();
        }
        System.out.println("Octal value: " + octal);
    }
}

