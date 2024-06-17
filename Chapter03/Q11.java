package odevler.chapter02.Chapter03;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month and the year: ");
        int month = input.nextInt();
        int year = input.nextInt();

        int days = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 4, 6, 9, 11 -> days = 30;
            case 2 -> {
                if (leapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
            }
        }
        System.out.println(getMonthName(month) + " " + year + " had " + days + " days.");
    }

    public static String getMonthName(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
    }

    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
