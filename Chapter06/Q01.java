package odevler.chapter02.Chapter06;

public class Q01 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (count % 10 == 0) {
                System.out.println();
            }
            count++;
            System.out.print(getPentagonalNumber(i) + ", ");
        }
    }
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
