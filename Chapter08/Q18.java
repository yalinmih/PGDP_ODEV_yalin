package odevler.chapter02.Chapter08;

import java.util.Arrays;

public class Q18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        shuffle(m);

        for (int[] rows : m) {
            System.out.println(Arrays.toString(rows));
        }
    }
    public static void shuffle(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int j = (int) (Math.random() * m.length);
            int temp = m[i][0];
            m[i][0] = m[j][0];
            m[j][0] = temp;
            temp = m[i][1];
            m[i][1] = m[j][1];
            m[j][1] = temp;
        }
    }
}
