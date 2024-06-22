package odevler.chapter02.Chapter04;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        char c = input.next().charAt(0);

        if (c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'F' ) {
            int num = switch (c) {
                case 'A' -> 4;
                case 'B' -> 3;
                case 'C' -> 2;
                case 'D' -> 1;
                case 'F' -> 0;
                default -> throw new IllegalStateException("Unexpected value: " + c);
            };
            System.out.println("The numeric value for grade " + c + " is " + num);
        } else {
            System.out.println(c + " is an invalid grade");
        }
    }
}
