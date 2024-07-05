package odevler.chapter02.Chapter05;

import java.util.Scanner;

public class Q49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int countVow = 0;
        int countCon = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                countVow++;
            } else if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                countCon++;
            }
        }
        System.out.println("The number of vowels is " + countVow);
        System.out.println("The number of consonants is " + countCon);
    }
}
