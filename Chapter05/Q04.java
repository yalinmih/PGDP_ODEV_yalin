package odevler.chapter02.Chapter05;

public class Q04 {
    public static void main(String[] args) {
        System.out.println("Miles         Kilometers");

        int mile = 1;
        while (mile < 11) {
            double km = mile * 1.609;
            String formattedKm = String.format("%.3f", km);
            System.out.println(mile + "             " + formattedKm);
            mile++;
        }
    }
}
