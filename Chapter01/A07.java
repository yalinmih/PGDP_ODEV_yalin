package odevler.chapter02.Chapter01;

public class A07 {
    public static void main(String[] args) {
        double a = 4 * (1.0 - ((double) 1 / 3) + ((double) 1 / 5) - ((double) 1 / 7) +
                ((double) 1 / 9) - ((double) 1 / 11));
        System.out.println(a);

        double b = 4 * (1.0 - ((double) 1 / 3) + ((double) 1 / 5) - ((double) 1 / 7) +
                ((double) 1 / 9) - ((double) 1 / 11) + ((double) 1 / 13));
        System.out.println(b);
    }
}
