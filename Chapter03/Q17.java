package odevler.chapter02.Chapter03;

import java.util.Random;
import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random random = new Random();
        int computer = random.nextInt(3);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int me = input.nextInt();

        System.out.print("The computer is " + choiceName(computer) + ". ");
        System.out.print("You are " + choiceName(me) + ". ");

        if (computer == me) {
            System.out.print("It is a draw");
        } else if ((me == 0 && computer == 2) || (me == 1 && computer == 0)  || (me == 2 && computer == 1)) {
            System.out.print("You won");
        } else {
            System.out.print("You lost");
        }
    }
    public static String choiceName(int choice) {
        return switch (choice) {
            case 0 -> "scissor";
            case 1 -> "rock";
            case 2 -> "paper";
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };
    }
}
