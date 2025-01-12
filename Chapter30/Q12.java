package odevler.chapter02.Chapter30;

import java.util.Scanner;
import java.util.stream.Stream;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        String numberString = Integer.toString(number);

        int sumOfDigits = numberString.chars()
                .map(c -> c - '0')
                .sum();

        System.out.println("The sum of digits are " + sumOfDigits);
    }
}
