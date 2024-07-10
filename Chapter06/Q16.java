package odevler.chapter02.Chapter06;

public class Q16 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s\n", "Year", "Day");
        System.out.println("-----------------------");

        for (int year = 2000; year <= 2020; year++) {
            int day = numberOfDaysInAYear(year);
            System.out.printf("%-15d%-15d\n", year, day);
        }

    }
    public static int numberOfDaysInAYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return 365;
        }
        return 364;
    }
}
