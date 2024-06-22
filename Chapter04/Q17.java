package odevler.chapter02.Chapter04;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();

        int days = switch (month) {
            case "Jan", "Mar", "May", "Jul", "Aug", "Oct", "Dec" -> 31;
            case "Apr", "Jun", "Sep", "Nov" -> 30;
            case "Feb" -> {
                if (isLeapYear(year)) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default -> throw new IllegalStateException("Unexpected value: " + month);
        };

        System.out.println(month + " " + year + " has " + days + " days");
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
