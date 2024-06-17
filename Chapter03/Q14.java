package odevler.chapter02.Chapter03;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Your Guess: ");
        String guess = input.nextLine();

        int random = (int) (Math.random() * 2);

        String result;
        if (random == 0) {
            result = "heads";
        } else {
            result = "tails";
        }
        System.out.println("The coin landed on " + result + ".");
        if (guess.equals(result)) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}
