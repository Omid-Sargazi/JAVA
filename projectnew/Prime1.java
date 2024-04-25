package projectnew;

import java.util.Scanner;

public class Prime1 {
    public static void main(String[] args) {

        // prime();
        // calc();
        Prog89();
    }

    public static void prime() {
        for (int x = 1; x <= 1100; x++) {
            int c = 0;
            for (int y = 2; y < x; y++) {
                if (x % y == 0)
                    c++;
            }
            if (c == 0) {
                System.out.print(x + ",");
            }
        }
    }

    public static void calc() {
        for (int x = 0; x <= 9; x++) {
            for (int y = 0; y <= 9; y++) {
                if (x * y < 10)
                    System.out.print("  " + x * y);
                else
                    System.out.print(" " + x * y);
            }
            System.out.print("\n");
        }
    }

    public static void Prog89() {

        Scanner input = new Scanner(System.in);
        long n;
        int s = 10;
        int p = 1;
        System.out.print("Enter a number from base two...");

        n = input.nextLong();
        while (n > 0) {
            int a = (int) (n % 10000);
            int b = a % 10 + 2 * (a / 10 % 10) + 4 * (a / 100 % 10) + 8 * (a / 1000);
            s = s * 100 + b;
            n = n / 10000;
            p = p * 10;

        } // end of while (n>0)

        while (s > 10) {
            int a = s % 100;
            if (a <= 9) {
                System.out.println(a);
            } else
                System.out.println((char) (a + 55));

            s = s / 100;
        }

        System.out.println(s);
    }// end of main
}// end of class
