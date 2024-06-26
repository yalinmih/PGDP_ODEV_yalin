package odevler.chapter02.Chapter05;

public class Q06 {
    public static void main(String[] args) {
        double mileToKm = 1.609;
        double kmToMile = 1 / mileToKm;
        System.out.println("Miles   Kilometers  |   Kilometers    Miles");

        int mile = 1;
        int km = 20;
        while (mile <= 10 && km <= 65) {
            double kmNew = mile * mileToKm;
            double mileNew = km * kmToMile;

            System.out.printf("%-7d %-10.3f  |   %-13d %.3f%n", mile, kmNew, km, mileNew);

            mile += 1;
            km += 5;
        }
    }
}
