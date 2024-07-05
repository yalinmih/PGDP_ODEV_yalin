package odevler.chapter02.Chapter05;

import java.util.Random;

public class Q40 {
    public static void main(String[] args) {
        Random random = new Random();

        int heads = 0;
        int tails = 0;

        for (int i = 1; i <= 1_000_000; i++) {
            int result = random.nextInt(2);
            if (result == 0) {
                heads++;
            }
            if (result == 1) {
                tails++;
            }
        }
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}
