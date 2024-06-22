package odevler.chapter02.Chapter04;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as String: ");
        String isbn = input.nextLine();

        int d1 = Character.getNumericValue(isbn.charAt(0));
        int d2 = Character.getNumericValue(isbn.charAt(1));
        int d3 = Character.getNumericValue(isbn.charAt(2));
        int d4 = Character.getNumericValue(isbn.charAt(3));
        int d5 = Character.getNumericValue(isbn.charAt(4));
        int d6 = Character.getNumericValue(isbn.charAt(5));
        int d7 = Character.getNumericValue(isbn.charAt(6));
        int d8 = Character.getNumericValue(isbn.charAt(7));
        int d9 = Character.getNumericValue(isbn.charAt(8));

        int checksum = (d1 + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) +
                (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;

        if (checksum == 10) {
            System.out.println("The ISBN-10 number is " + isbn + "X");
        } else {
            System.out.println("The ISBN-10 number is " + isbn + checksum);
        }
    }
}
