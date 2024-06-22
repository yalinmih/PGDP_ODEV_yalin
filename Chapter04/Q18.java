package odevler.chapter02.Chapter04;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String s = input.nextLine();

        if ((s.charAt(0) == 'M' || s.charAt(0) == 'C' || s.charAt(0) == 'I') && (s.charAt(1) == '1'
                || s.charAt(1) == '2' || s.charAt(1) == '3' || s.charAt(1) == '4')) {
            String subject = switch (s.charAt(0)) {
                case 'M' -> "Mathematics";
                case 'C' -> "Computer Science";
                case 'I' -> "Information Technology";
                default -> throw new IllegalStateException("Unexpected value: " + s.charAt(0));
            };
            String student = switch (s.charAt(1)) {
                case '1' -> " Freshman";
                case '2' -> " Sophomore";
                case '3' -> " Junior";
                case '4' -> " Senior";
                default -> throw new IllegalStateException("Unexpected value: " + s.charAt(1));
            };
            System.out.println(subject + student);
        } else {
            System.out.println("Invalid input");
        }
    }
}