package WithoutIf.ProblemsWIthJava;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int n = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        System.out.println("sum of the divisors n is " + sum);
    }
}
