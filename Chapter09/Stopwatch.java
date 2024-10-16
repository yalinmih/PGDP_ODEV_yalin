package odevler.chapter02.Chapter09;

import java.util.Arrays;

public class Stopwatch {
    private long startTime;
    private long endTime;

    public Stopwatch() {
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        int[] array = new int[100_000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100_000);
        }
        Stopwatch stopwatch = new Stopwatch();

        stopwatch.start();
        Arrays.sort(array); // burdaki sort quicksort
        stopwatch.stop();

        System.out.println("The taken time is " + stopwatch.getElapsedTime() + " milliseconds");
    }
}