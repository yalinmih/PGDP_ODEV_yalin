package odevler.chapter02.Chapter06;

//chatgpt yardımı ile

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a credit card number as a long integer: ");
        long number = input.nextLong();

        if (isValid(number)) {
            System.out.println(number + " is valid");
        } else {
            System.out.println(number + " is invalid");
        }
    }

    public static boolean isValid(long number) {
        int result = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return result % 10 == 0;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        boolean doubleDigit = false;

        while (number > 0) {
            int digit = (int)(number % 10);
            number /= 10;

            if (doubleDigit) {
                sum += getDigit(2 * digit);
            }

            doubleDigit = !doubleDigit;
        }

        return sum;
    }

    public static int getDigit(int number) {
        if (number < 10) {
            return number % 10;
        }
        return (number / 10) + (number % 10);
    }

    public static int sumOfOddPlace(long number) {
        int sum = 0;
        boolean doubleDigit = true;

        while (number > 0) {
            int digit = (int)(number % 10);
            number /= 10;

            if (doubleDigit) {
                sum += digit;
            }

            doubleDigit = !doubleDigit;
        }

        return sum;
    }

    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    public static int getSize(long d) {
        int size = 0;
        while (d > 0) {
            d /= 10;
            size++;
        }
        return size;
    }

    public static long getPrefix(long number, int k) {
        long result = number;
        int size = getSize(number);

        for (int i = 0; i < size - k; i++) {
            result /= 10;
        }
        return result;
    }
}
