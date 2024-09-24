package odevler.chapter02.Chapter08;

import java.util.Arrays;

public class Q16 {
    public static void main(String[] args) {
        int[][] array = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};

        sort(array);

        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void sort(int[][] m) {
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (m[i][0] > m[j][0]) {
                    int[] temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                } else if (m[i][0] == m[j][0]) {
                    if (m[i][1] > m[j][1]) {
                        int[] temp = m[i];
                        m[i] = m[j];
                        m[j] = temp;
                    }
                }
            }
        }
    }
}
