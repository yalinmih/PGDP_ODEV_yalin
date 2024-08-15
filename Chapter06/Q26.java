package odevler.chapter02.Chapter06;

public class Q26 {
    public static void main(String[] args) {
        int count = 0;
        int num = 0;
        while (count < 100) {
            if (isPalindromicPrime(num)) {
                System.out.print(num + " ");
                count++;

                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            num++;
        }
    }

    public static boolean isPalindromicPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        int givenNumber = number;
        int reversed = 0;

        while (number != 0) {
            int temp = number % 10;
            reversed = reversed * 10 + temp;
            number /= 10;
        }
        return reversed == givenNumber;
    }
}
