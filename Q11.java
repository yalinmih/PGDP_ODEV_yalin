package odevler.chapter01;

public class Q11 {
    public static void main(String[] args) {
        int population = 312_032_486;
        double totalSeconds = 365 * 24 * 60 * 60;

        double birth = totalSeconds / 7;
        double death = totalSeconds / 13;
        double immigrant = totalSeconds / 45;
        double changeYear = birth - death + immigrant;

        for (int i = 0; i < 5; i++) {
            population += (int) changeYear;
            System.out.println(population);
        }
    }
}
