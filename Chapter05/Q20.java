package odevler.chapter02.Chapter05;

public class Q20 {
    public static void main(String[] args) {
        int count = 0;
        boolean isPrime;

        for (int number = 2; number <= 1000; number++) {
            isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
                count++;

                if (count % 8 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
