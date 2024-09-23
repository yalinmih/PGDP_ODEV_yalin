package odevler.chapter02.Chapter08;

import java.util.Arrays;
import java.util.Comparator;

public class Q04 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};

        int[][] employeesAndHours = new int[matrix.length][2];

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            employeesAndHours[i][0] = i;
            employeesAndHours[i][1] = sum;
        }

        Arrays.sort(employeesAndHours, Comparator.comparing(a -> a[1]));

        for (int i = employeesAndHours.length - 1; i > 0; i--) {
            System.out.println("Worker " + employeesAndHours[i][0] + " has total " +
                    employeesAndHours[i][1] + " hours.");
        }
    }
}
