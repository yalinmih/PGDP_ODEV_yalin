package odevler.chapter02.Chapter04;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String hex = input.nextLine();

        if ((hex.charAt(0) >= '0' && hex.charAt(0) <= '9')
                || (hex.charAt(0) >= 'A' && hex.charAt(0) <= 'F')) {
            String digit = switch (hex.charAt(0)) {
                case '0' -> "0000";
                case '1' -> "0001";
                case '2' -> "0010";
                case '3' -> "0011";
                case '4' -> "0100";
                case '5' -> "0101";
                case '6' -> "0110";
                case '7' -> "0111";
                case '8' -> "1000";
                case '9' -> "1001";
                case 'A' -> "1010";
                case 'B' -> "1011";
                case 'C' -> "1100";
                case 'D' -> "1101";
                case 'E' -> "1110";
                case 'F' -> "1111";
                default -> throw new IllegalStateException("Unexpected value: " + hex.charAt(0));
            };
            System.out.println("The binary value is " + digit);
        } else {
            System.out.println(hex.charAt(0) + " is an invalid input");
        }
    }
}
