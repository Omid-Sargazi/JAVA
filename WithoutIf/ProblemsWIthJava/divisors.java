package WithoutIf.ProblemsWIthJava;

import java.util.Scanner;

public class divisors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                if (i % 2 != 0)
                    System.out.print(i + " ");
        }

    }
}
