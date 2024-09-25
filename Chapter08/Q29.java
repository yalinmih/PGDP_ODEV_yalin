package odevler.chapter02.Chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] list1 = new int[3][3];
        int[][] list2 = new int[3][3];

        System.out.print("Enter list1: ");
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[i].length; j++) {
                list1[i][j] = input.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        for (int i = 0; i < list2.length; i++) {
            for (int j = 0; j < list2[i].length; j++) {
                list2[i][j] = input.nextInt();
            }
        }
        if (equals(list1, list2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        int[] list1 = new int[m1.length * m1[0].length];
        int[] list2 = new int[m2.length * m2[0].length];

        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                list1[index1++] = m1[i][j];
                list2[index2++] = m2[i][j];
            }
        }
        Arrays.sort(list1);
        Arrays.sort(list2);

        return Arrays.equals(list1, list2);
    }
}
