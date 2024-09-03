package odevler.chapter02.Chapter07;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int length = input.nextInt();

        System.out.print("Enter the values: ");
        int[] values = new int[length];

        for (int i = 0; i < length; i++) {
            values[i] = input.nextInt();
        }

        boolean b = isConsecutiveFour(values);
        if (b) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }
    }

    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 0; i < values.length - 3; i++) {
            if (values[i] == values[i + 1]) {
                if (values[i] == values[i + 2]) {
                    if (values[i] == values[i + 3]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
