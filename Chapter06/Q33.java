package odevler.chapter02.Chapter06;

//chatgpt yardımı ile

public class Q33 {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        long totalSeconds = currentTime / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + 3) % 24;
        long totalDays = totalHours / 24;

        int currentYear = 1970;
        while (true) {
            int daysInYear = isLeapYear(currentYear) ? 366 : 365;
            if (totalDays < daysInYear) {
                break;
            }
            currentYear++;
            totalDays -= daysInYear;
        }

        int currentMonth = 1;
        int daysInMonth = getDaysInMonth(currentYear, currentMonth);
        while (totalDays >= daysInMonth) {
            totalDays -= daysInMonth;
            currentMonth++;
            daysInMonth = getDaysInMonth(currentYear, currentMonth);
        }

        int currentDay = (int) (totalDays + 1);
        System.out.printf("Current date and time is %s %d, %d %02d:%02d:%02d\n",
                getMonthName(currentMonth), currentDay, currentYear, currentHour, currentMinute, currentSecond);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int year, int month) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 0;
        };
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
}
