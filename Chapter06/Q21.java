package odevler.chapter02.Chapter06;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.toUpperCase().charAt(i);
            if (c >= 'A' && c <= 'Z') {
                int num = getNumber(c);
                System.out.print(num + "");
            } else {
                System.out.print(c + "");
            }
        }
    }

    public static int getNumber(char uppercaseLetter) {
        return switch (uppercaseLetter) {
            case 'A', 'B', 'C' -> 2;
            case 'D', 'E', 'F' -> 3;
            case 'G', 'H', 'I' -> 4;
            case 'J', 'K', 'L' -> 5;
            case 'M', 'N', 'O' -> 6;
            case 'P', 'Q', 'R', 'S' -> 7;
            case 'T', 'U', 'V' -> 8;
            case 'W', 'X', 'Y', 'Z' -> 9;
            default -> throw new IllegalStateException("Unexpected value: " + uppercaseLetter);
        };
    }
}
