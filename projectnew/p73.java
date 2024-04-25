package projectnew;

import java.util.Scanner;

public class p73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Please Enetr a number");
        n = input.nextInt();
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
