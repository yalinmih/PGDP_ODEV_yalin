package odevler.chapter02.Chapter03;

import java.util.Random;

public class Q16 {
    public static void main(String[] args) {
        int x1 = -50;
        int x2 = 50;
        int y1 = -100;
        int y2 = 100;

        Random random = new Random();
        int x = x1 + random.nextInt(x2 - x1 + 1);
        int y = y1 + random.nextInt(y2 - y1 + 1);

        System.out.println("Random Point: (" + x + ", " + y + ")" );
    }
}
