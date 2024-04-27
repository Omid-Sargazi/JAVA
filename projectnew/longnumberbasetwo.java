package projectnew;

import java.util.Scanner;

public class longnumberbasetwo {
    public static void main(String[] args) {
        System.out.println("Enter a long number");
        Scanner input = new Scanner(System.in);
        int A[] = new int[100];
        long n;
        int Ac = 0;
        n = input.nextLong();
        // System.out.print("n is:" + n);

        while (n > 0) {
            A[Ac] = (int) (n % 2);
            Ac++;
            n = n / 2;
            // System.out.print("n is:" + n);

        }

        for (int x = Ac - 1; x >= 0; x--) {
            System.out.print("" + A[x]);
        }

    }
}
