package odevler.chapter02.Chapter05;

import java.sql.SQLOutput;

public class Q12 {
    public static void main(String[] args) {
        // direkt INTEGER_MIN_VALUE

        int n = 0;
        while (Math.pow(n, 2) < 12000) {
            n++;
        }
        System.out.println(n);
    }
}
