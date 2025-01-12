package odevler.chapter02.Chapter30;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexString = scanner.nextLine().toUpperCase(); // Convert to upper case to simplify conversion

        if (!hexString.matches("[0-9A-F]+")) {
            System.out.println("Invalid hexadecimal number.");
            return;
        }

        try {
            int decimalValue = IntStream.range(0, hexString.length())
                    .map(i -> hexString.charAt(hexString.length() - 1 - i))
                    .map(c -> c >= 'A' ? c - 'A' + 10 : c - '0')
                    .reduce(0, (acc, digit) -> acc * 16 + digit);

            System.out.println("Decimal value: " + decimalValue);
        } catch (Exception e) {
            System.out.println("Error in conversion: " + e.getMessage());
        }
    }
}
