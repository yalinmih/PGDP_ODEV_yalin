package odevler.chapter02.Chapter05;

import java.util.Random;

public class Q32 {
    public static void main(String[] args) {
        Random random = new Random();

        int first = random.nextInt(10);
        int second = random.nextInt(10);

        while (second == first) {
            second = random.nextInt(10);
        }

        int lottery = first * 10 + second;

        System.out.println("The lottery number is " + lottery);
    }
}

