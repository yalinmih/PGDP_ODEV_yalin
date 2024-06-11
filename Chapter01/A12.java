package odevler.chapter02.Chapter01;

public class A12 {
    public static void main(String[] args) {
        double totalKm = 24 * 1.6;
        double totalTime = 1 + ((double) 40 / 60) + ((double) 35 / 3600);

        double average = totalKm / totalTime;
        System.out.println(average);
    }
}
