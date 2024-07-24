package odevler.chapter02.Chapter06;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        if (checkPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
    public static boolean checkPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))) {
                return false;
        }
    }
        int num = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if ((c >= '0' && c <= '9')) {
                num++;
            }
        }
        if (num < 2) {
            return false;
        }
        return true;
    }
}
