package odevler.chapter02.Chapter04;

public class Q16 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 26);
        char letter = (char) ('A' + random);

        System.out.println(letter);
    }
}
