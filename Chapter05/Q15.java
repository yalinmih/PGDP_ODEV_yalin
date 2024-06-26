package odevler.chapter02.Chapter05;

public class Q15 {
    public static void main(String[] args) {
        int count = 0;
        for (char c = '!'; c <= '~'; c++) {
            System.out.print(c + " ");
            count++;

            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
