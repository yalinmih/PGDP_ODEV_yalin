package odevler.chapter02.Chapter30;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.print("Enter a char: ");
        char letter = input.next().charAt(0);

        int count = str.chars()
                .filter(c -> c == letter)
                .map(c -> 1)
                .sum();

        System.out.println("There are " + count + " " + letter + " in the word " + str);
    }
}
