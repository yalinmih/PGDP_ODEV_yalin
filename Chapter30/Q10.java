package odevler.chapter02.Chapter30;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        if (!binary.matches("[01]+")) {
            System.out.println("Invalid binary number.");
            return;
        }

        try {
            int decimal = IntStream.range(0, binary.length())
                    .map(i -> binary.charAt(binary.length() - 1 - i) - '0')
                    .reduce(0, (acc, b) -> acc * 2 + b);

            System.out.println("The decimal value is " + decimal);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
