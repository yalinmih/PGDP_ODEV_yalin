package odevler.chapter02.Chapter06;

//chatgpt yardımı ile

public class Q24 {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + 3)  % 24;
        long totalDays = totalHours / 24;

        int currentYear = 1970;
        int currentMonth = 1;
        int currentDay = 1;

        while (totalDays >= getNumberOfDaysInYear(currentYear)) {
            totalDays -= getNumberOfDaysInYear(currentYear);
            currentYear++;
        }

        while (totalDays >= getNumberOfDaysInMonth(currentYear, currentMonth)) {
            totalDays -= getNumberOfDaysInMonth(currentYear, currentMonth);
            currentMonth++;
        }

        currentDay += (int) totalDays;

        System.out.println("Current date and time is " + getMonthName(currentMonth)
                + " " + currentDay + ", " + currentYear + " " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " GMT");
    }

    public static int getNumberOfDaysInYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 0;
        };
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
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
            default -> "";
        };
    }
}
