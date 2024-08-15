package odevler.chapter02.Chapter06;

public class Q25 {
    public static void main(String[] args) {
        String str1 = convertMillis(5500);
        String str2 = convertMillis(100000);
        String str3 = convertMillis(555550000);

        System.out.print(str1 + "\n" + str2 + "\n" + str3);
    }

    public static String convertMillis(long millis) {
        long seconds = millis / 1000;

        long minutes = seconds / 60;
        seconds -= minutes * 60;

        long hours = minutes / 60;
        minutes -= hours * 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}