package odevler.chapter02.Chapter05;

import java.util.Scanner;

public class Q51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        int index = 0;
        StringBuilder common = new StringBuilder();

        if (str1.charAt(0) != str2.charAt(0)) {
            System.out.println(str1 + " and " + str2 + " have no common prefix");
        } else {
            while (str1.charAt(index) == str2.charAt(index)) {
                common.append(str1.charAt(index));
                index++;
            }
        }
        System.out.println("The common prefix is " + common);
    }
}
