package odevler.chapter02.Chapter06;

public class Q12 {
    public static void main(String[] args) {
        printChars('1', 'Z', 10);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 0;
        for (char i = ch1; i <= ch2; i++) {
            System.out.print(i + "  ");
            count++;

            if (count % numberPerLine == 0) {
                System.out.println();
            }
        }
    }
}
