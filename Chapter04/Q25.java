package odevler.chapter02.Chapter04;

public class Q25 {
    public static void main(String[] args) {
        int random1 = (int) (Math.random() * 26);
        int random2 = (int) (Math.random() * 26);
        int random3 = (int) (Math.random() * 26);

        char letter1 = (char) ('A' + random1);
        char letter2 = (char) ('A' + random2);
        char letter3 = (char) ('A' + random3);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);
        int number4 = (int) (Math.random() * 10);

        System.out.print("" + letter1 + letter2 + letter3 + " " + number1 + number2 + number3 + number4);
    }
}
