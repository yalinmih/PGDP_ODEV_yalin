package odevler.chapter02.Chapter05;

import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();

        int sum = 0;
        int temp = isbn;

        for (int i = 9; i >= 1; i--) {
            int digit = temp % 10;
            sum += digit * i;
            temp /= 10;
        }

        sum %= 11;

        if (sum == 10) {
            System.out.println("The ISBN-10 number is " + isbn + "X");
        } else {
            System.out.println("The ISBN-10 number is " + isbn + sum);
        }
    }
}
