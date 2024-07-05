package odevler.chapter02.Chapter05;

public class Q33 {
    public static void main(String[] args) {
        for (int num = 1; num < 10000; num++) {
            double sum = 0.0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}
