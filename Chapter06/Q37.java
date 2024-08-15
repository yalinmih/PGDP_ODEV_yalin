package odevler.chapter02.Chapter06;

import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("Enter the width: ");
        int width = input.nextInt();

        String res = format(number, width);
        System.out.println(res);
    }

    public static String format(int number, int width) {
        String numberStr = String.valueOf(number);
        int countNumber = numberStr.length();

        if (countNumber >= width) {
            return numberStr;
        } else {
            int numberOf0 = width - countNumber;
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < numberOf0; i++) {
                result.append("0");
            }
            result.append(numberStr);

            return result.toString();
        }
    }
}
