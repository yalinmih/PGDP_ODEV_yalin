package odevler.chapter02.Chapter07;

//boolean kısmı chatgpt yardımı ile

import java.util.Random;

public class Q24 {
    public static void main(String[] args) {
        Random random = new Random();

        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int num = 0;
        int diffSuits = 0;


        boolean[] picked = new boolean[4];

        while (diffSuits < 4) {
            int suitIndex = random.nextInt(4);
            int rankIndex = random.nextInt(13);

            num++;
            if (!picked[suitIndex]) {
                picked[suitIndex] = true;
                diffSuits++;
                System.out.println(ranks[rankIndex] + " of " + suits[suitIndex]);
            }
        }
        System.out.println("Number of picks: " + num);
    }
}