package odevler.chapter02.Chapter05;

import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        StringBuilder strNew = new StringBuilder(" ");
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            strNew.append(c);
        }
        System.out.println("The reversed string is" + strNew);
    }
}
