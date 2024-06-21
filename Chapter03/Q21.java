package odevler.chapter02.Chapter03;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int day = input.nextInt();

        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }

        int m = month;
        int j = year / 100;
        int k = year % 100;

        int h = (day + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        String dayOfWeek = getDay(h);
        System.out.println("Day of the week is " + dayOfWeek);
    }
    public static String getDay(int day) {
        return switch (day) {
            case 0 -> "Saturday";
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 ->"Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default ->"Invalid day of the week";
        };
    }
}
