package odevler.chapter02.Chapter08;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] list1 = new int[3][3];
        int[][] list2 = new int[3][3];

        System.out.print("Enter list1: ");
        fillMatrixWithUserInput(list1, input);
        System.out.print("Enter list2: ");
        fillMatrixWithUserInput(list2, input);

        if (equals(list1, list2)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
    }

    private static void fillMatrixWithUserInput(int[][] list1, Scanner input) {
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[i].length; j++) {
                list1[i][j] = input.nextInt();
            }
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}