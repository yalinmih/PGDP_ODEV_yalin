package odevler.chapter02.Chapter05;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter an integer between 1-15: ");
        number = input.nextInt();

        if (number > 1 && number <= 15) {
            for (int i = 1; i <= number; i++) {
                for (int k = number; k > i; k--) {
                    System.out.print("   ");
                }
                for (int l = i; l >= 1; l--) {
                    System.out.printf("%3d", l);
                }
                for (int m = 2; m <= i; m++) {
                    System.out.printf("%3d", m);
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}