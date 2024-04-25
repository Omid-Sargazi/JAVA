package projectnew;

import java.util.Scanner;

public class prime1000 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Please Enter a number");
        n = input.nextInt();
        for (int x = 1; x <= n; x++) {
            int c = 0;
            for (int y = 1; y <= x; y++) {
                if (x % y == 0) {
                    c++;
                }
            }
            if (c == 2) {
                System.out.print(x + ",");
            }
        }
    } // rnd of main
}// end of class
