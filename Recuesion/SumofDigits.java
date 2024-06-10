package Recuesion;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(SumOfDigits(12345));
        System.out.println(SumOfDigitsWithoutRecursion(12345));
    }

    public static int SumOfDigits(int n) {
        if (n < 10) {
            return n;
        }
        int p = (n % 10) + SumOfDigits(n / 10);
        return p;
    }

    public static int SumOfDigitsWithoutRecursion(int n) {
        int p = 0;
        while (n > 0) {
            p = n % 10 + p;
            n = n / 10;
        }
        return p;
    }
}
