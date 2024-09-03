package odevler.chapter02.Chapter07;

import java.util.Random;

public class Q29 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = 0;
        int sum = 0;

        while (sum != 24) {
            sum = 0;

            for (int i = 0; i < 4; i++) {
                sum += random.nextInt(13) + 1;
            }
            num++;
        }
        System.out.println("The number of picks is " + num);
    }
}