package odevler.chapter02.Chapter05;

import java.util.Scanner;

public class Q47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn = input.nextLine();

        if (isbn.length() == 12) {
            int sum = 0;
            for (int i = 0; i < 12; i++) {
                int digit = Character.getNumericValue(isbn.charAt(i));
                if (i % 2 == 0) {
                    sum += digit;
                } else {
                    sum += 3 * digit;
                }
            }
            int checksum = 10 - (sum % 10);
            if (checksum == 10) {
                checksum = 0;
            }
            System.out.println("The ISBN-13 number is " + isbn + checksum);
        } else {
            System.out.println(isbn + " is an invalid input");
        }
        input.close();
    }
}
