package odevler.chapter02.Chapter06;

import java.util.Random;

public class Q32 {
    public static void main(String[] args) {
        Random random = new Random();

        int number = 10000;
        int win = 0;

        for (int i = 0; i < number; i++) {
            if (game(random)) {
                win++;
            }
        }
        System.out.println("Total number of wins is " + win);
    }

    public static boolean game(Random random) {
        int dice1 = roll(random);
        int dice2 = roll(random);
        int sum = dice1 + dice2;

        if (sum == 7 || sum == 11) {
            return true;
        } else if (sum == 2 || sum == 3 || sum == 12) {
            return false;
        } else {
            while (true) {
                int dice3 = roll(random);
                int dice4 = roll(random);
                int sum2 = dice3 + dice4;

                if (sum2 == sum) {
                    return true;
                } else if (sum2 == 7) {
                    return false;
                }
            }
        }
    }

    public static int roll(Random random) {
        return random.nextInt(6) + 1;
    }
}
