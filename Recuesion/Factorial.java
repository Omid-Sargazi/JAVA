package Recuesion;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(factorial(4));
        System.out.println(factorialWithotRecusrion(4));

    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int F = n * factorial(n - 1);
        return F;
    }

    public static int factorialWithotRecusrion(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
