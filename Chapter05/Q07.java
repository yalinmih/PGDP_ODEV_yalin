package odevler.chapter02.Chapter05;

public class Q07 {
    public static void main(String[] args) {
        double rate = 1.05;

        double tuition10 = 10_000;
        for (int i = 0; i < 10; i++) {
            tuition10 *= rate;
        }
        double cost = 0;
        double tuition10New = tuition10;
        for (int i = 0; i < 4; i++) {
            tuition10New *= rate;
            cost += tuition10New;
        }
        System.out.println("Tuition in 10 years -> " + tuition10);
        System.out.println("Total cost of four years -> " + cost);
    }
}
