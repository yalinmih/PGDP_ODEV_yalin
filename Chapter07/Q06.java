package odevler.chapter02.Chapter07;

//chapter 5 PrimeNumber

public class Q06 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime numbers are \n");
        int[] primes = new int[NUMBER_OF_PRIMES];

        while (count < NUMBER_OF_PRIMES) {
            boolean isPrime = true;

            for (int i = 0; i < count && primes[i] <= Math.sqrt(number); i++) {
                if (number % primes[i] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes[count] = number;
                count++;
            }

            number++;
        }

        for (int i = 0; i < NUMBER_OF_PRIMES; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(primes[i] + " ");
        }
    }
}