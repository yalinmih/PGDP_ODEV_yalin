package odevler.chapter02.Chapter10;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(System.currentTimeMillis()); // this olmadan çalışmıyor
    }

    public Time(long elapsedTime) {
        setTime(elapsedTime);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(long elapseTime) {
        long secondsTotal = elapseTime / 1000;
        second = (int) (secondsTotal % 60);

        long minutesTotal = secondsTotal / 60;
        minute = (int) (minutesTotal % 60);

        long hoursTotal = minutesTotal / 60;
        hour = (int) (hoursTotal % 24);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.printf("%s:%s:%s", time1.hour, time1.minute, time1.second);

        System.out.println();

        Time time2 = new Time(555550000);
        System.out.printf("%s:%s:%s", time2.hour, time2.minute, time2.second);
    }
}