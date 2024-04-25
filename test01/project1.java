package test01;

import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.println("Enter a number");
        n = input.nextInt();
        System.out.println(n);

        for (int x = 1; x <= n; x++) {
            if (n % x == 0 && x != n) {
                System.out.print(x + ",");
            }
            if (n % x == 0 && x == n) {
                System.out.println(x);
            }
        }
    }
}
