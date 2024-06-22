package odevler.chapter02.Chapter04;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String s = input.nextLine();

        char c = s.toLowerCase().charAt(0);

        if (c >= 97 && c <= 122) {
            int num = switch (c) {
              case 'a', 'b', 'c' -> 2;
              case 'd', 'e', 'f' -> 3;
              case 'g', 'h', 'i' -> 4;
              case 'j', 'k', 'l' -> 5;
              case 'm', 'n', 'o' -> 6;
              case 'p', 'q', 'r', 's' -> 7;
              case 't', 'u', 'v' -> 8;
              case 'w', 'x', 'y', 'z' -> 9;
              default -> throw new IllegalStateException("Unexpected value: " + c);
            };
            System.out.println("The corresponding number is " + num);
        } else {
            System.out.println(c + " is an invalid input");
        }
    }
}
