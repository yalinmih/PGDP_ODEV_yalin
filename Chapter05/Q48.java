package odevler.chapter02.Chapter05;

import java.util.Scanner;

public class Q48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        StringBuilder strNew = new StringBuilder();
        for (int i = 0; i < str.length(); i = i + 2) {
            strNew.append(str.charAt(i));
        }
        System.out.println(strNew);
    }
}
