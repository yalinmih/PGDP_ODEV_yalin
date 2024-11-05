package odevler.chapter02.Chapter10;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value <= 1)
            return false;
        if (value == 2 || value == 3)
            return true;
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2 || num == 3)
            return true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.getValue() % 2 == 0;
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.getValue() % 2 != 0;
    }

    public static boolean isPrime(MyInteger myInteger) {
        int num = myInteger.getValue();
        if (num <= 1)
            return false;
        if (num == 2 || num == 3)
            return true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(int num) {
        return value == num;
    }

    public boolean equals(MyInteger myInteger) {
        return myInteger.getValue() == value;
    }

    public static int parseInt(char[] arr) {
        int result = 0;
        for (char c : arr) {
            result = result * 10 + (c - '0');
        }
        return result;
    }

    public static int parseInt(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result = result * 10 + (c - '0');
        }
        return result;
    }

    public int getValue() {
        return value;
    }
}
