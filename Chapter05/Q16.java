package odevler.chapter02.Chapter05;

public class Q16 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * Integer.MAX_VALUE + 1);

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + ", ");
                number /= i;
            }
        }
    }
}
