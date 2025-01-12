package odevler.chapter02.Chapter30;

import java.util.stream.IntStream;

public class Q05 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 10);
            array[random]++;
        }

        IntStream.range(0, array.length)
                .forEach(number -> System.out.println("Number of " + number + " is " + array[number]));
    }
}
