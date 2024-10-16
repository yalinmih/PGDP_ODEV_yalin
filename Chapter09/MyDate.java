package odevler.chapter02.Chapter09;

//toString methoduna gerek yok

import java.util.Date;

public class MyDate {
    public static void main(String[] args) {
        long[] elapsedTime = {10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L,
                10000000000L, 100000000000L};

        for (int i = 0; i < elapsedTime.length; i++) {
            Date date = new Date(elapsedTime[i]);
            System.out.println(elapsedTime[i] + ": " + date.toString());
        }
    }
}