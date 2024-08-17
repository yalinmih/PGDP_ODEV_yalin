package odevler.chapter02.Chapter05;

//chatGPT yardımı ile

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year: ");
        int firstDay = input.nextInt();

        int daysInMonth = 0;
        String monthName = "";

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        for (int month = 1; month <= 12; month++) {
            daysInMonth = switch (month) {
                case 1 -> {
                    monthName = "January";
                    yield 31;
                }
                case 2 -> {
                    monthName = "February";
                    yield isLeapYear ? 29 : 28;
                }
                case 3 -> {
                    monthName = "March";
                    yield 31;
                }
                case 4 -> {
                    monthName = "April";
                    yield 30;
                }
                case 5 -> {
                    monthName = "May";
                    yield 31;
                }
                case 6 -> {
                    monthName = "June";
                    yield 30;
                }
                case 7 -> {
                    monthName = "July";
                    yield 31;
                }
                case 8 -> {
                    monthName = "August";
                    yield 31;
                }
                case 9 -> {
                    monthName = "September";
                    yield 30;
                }
                case 10 -> {
                    monthName = "October";
                    yield 31;
                }
                case 11 -> {
                    monthName = "November";
                    yield 30;
                }
                case 12 -> {
                    monthName = "December";
                    yield 31;
                }
                default -> daysInMonth;
            };

            System.out.println("   " + monthName + " " + year);
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

            for (int i = 0; i < firstDay; i++) {
                System.out.print("    ");
            }

            for (int day = 1; day <= daysInMonth; day++) {
                System.out.printf("%4d", day);

                if ((day + firstDay) % 7 == 0) {
                    System.out.println();
                }
            }

            System.out.println();

            firstDay = (firstDay + daysInMonth) % 7;
        }
    }
}

