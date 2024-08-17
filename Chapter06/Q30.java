package odevler.chapter02.Chapter06;

import java.util.Random;
import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int sum = dice1 + dice2;

        System.out.println("You rolled " + dice1 + " + " + dice2 +  " = " + sum);

    }
}
