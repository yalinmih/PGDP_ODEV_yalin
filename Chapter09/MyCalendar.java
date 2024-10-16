package odevler.chapter02.Chapter09;

import java.util.GregorianCalendar;

public class MyCalendar {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        int month = calendar.get(GregorianCalendar.MONTH) + 1;
        int year = calendar.get(GregorianCalendar.YEAR);

        System.out.println("The current date is " + day + "-" + month + "-" + year);

        calendar.setTimeInMillis(1234567898765L);
        int day2 = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        int month2 = calendar.get(GregorianCalendar.MONTH) + 1;
        int year2 = calendar.get(GregorianCalendar.YEAR);

        System.out.println("The elapsed date is " + day2 + "-" + month2 + "-" + year2);
    }
}
