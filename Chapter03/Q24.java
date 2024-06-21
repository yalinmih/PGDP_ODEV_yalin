package odevler.chapter02.Chapter03;

import java.util.Random;

public class Q24 {
    public static void main(String[] args) {
        Random random = new Random();
        String pickedRank;
        String pickedSuit;

        int rank = random.nextInt(13);
        pickedRank = switch (rank) {
            case 0 -> "Ace";
            case 10 -> "Jack";
            case 11 -> "Queen";
            case 12 -> "King";
            default -> String.valueOf(rank + 1);
        };

        int suit = random.nextInt(4);
        pickedSuit = switch (suit) {
            case 0 -> "Clubs";
            case 1 -> "Diamonds";
            case 2 -> "Hearts";
            case 3 -> "Spades";
            default -> "Unknown";
        };
        System.out.println("The card you picked is " + pickedRank + " of " + pickedSuit);
    }
}
