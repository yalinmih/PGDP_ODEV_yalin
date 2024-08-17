package odevler.chapter02.Chapter05;

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userWins = 0;
        int computerWins = 0;

        while (Math.abs(userWins - computerWins) <= 2) {
            int computerChoice = (int)(Math.random() * 3);

            System.out.print("Enter your choice (0: Scissor, 1: Rock, 2: Paper): ");
            int userChoice = input.nextInt();

            if (computerChoice == 0) {
                System.out.println("Computer chose: Scissor");
            } else if (computerChoice == 1) {
                System.out.println("Computer chose: Rock");
            } else if (computerChoice == 2) {
                System.out.println("Computer chose: Paper");
            }

            if (userChoice == 0) {
                System.out.println("You chose: Scissor");
            } else if (userChoice == 1) {
                System.out.println("You chose: Rock");
            } else if (userChoice == 2) {
                System.out.println("You chose: Paper");
            }

            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                    (userChoice == 1 && computerChoice == 0) ||
                    (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You win this round!");
                userWins++;
            } else {
                System.out.println("Computer wins this round!");
                computerWins++;
            }

            System.out.println("User wins: " + userWins + " | Computer wins: " + computerWins);
        }

        if (userWins > computerWins) {
            System.out.println("Congratulations! You won the game.");
        } else {
            System.out.println("Sorry, the computer won the game.");
        }
    }
}

