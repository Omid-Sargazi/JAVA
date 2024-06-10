package Recuesion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int f = fibonacci(n - 1) + fibonacci(n - 2);
        return f;
    }
}
