package odevler.chapter02.Chapter06;

import java.util.Random;

public class Q30 {
    public static void main(String[] args) {
        Random random = new Random();
        int dice1 = roll(random);
        int dice2 = roll(random);
        int sum = dice1 + dice2;

        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);

        if (sum == 7 || sum == 11) {
            System.out.println("You win");
        } else if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You lose");
        } else {
            System.out.println("point is " + sum);
            boolean keepGoing = true;

            while (keepGoing) {
                int dice3 = roll(random);
                int dice4 = roll(random);
                int sum2 = dice3 + dice4;

                System.out.println("You rolled " + dice3 + " + " + dice4 + " = " + sum2);

                if (sum2 == sum) {
                    System.out.println("You win");
                    keepGoing = false;
                } else if (sum2 == 7) {
                    System.out.println("You lose");
                    keepGoing = false;
                }
            }
        }

    }
    public static int roll(Random random) {
        return random.nextInt(6) + 1;
    }
}
