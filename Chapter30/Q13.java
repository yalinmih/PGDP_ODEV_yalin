package odevler.chapter02.Chapter30;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int count = str.chars()
                .filter(Character::isLetter)
                .map(c -> 1)
                .sum();

        System.out.println("The given string has " + count + " letters.");
    }
}
