package projectnew;

import java.util.Scanner;

public class mininarray {
    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        int[] A = { 10, 2, 3, 4, 5, 6, 4, 7, -100 };
        int min = 0;
        int temp = 0;
        for (int x = 0; x <= A.length - 1; x++) {
            min = x;
            for (int y = x + 1; y < A.length; y++)
                if (A[min] > A[y])
                    min = y;
            temp = A[x];
            A[x] = A[min];
            A[min] = temp;
        }
        for (int x = 0; x < A.length; x++) {

            System.out.print("" + A[x] + " ");
        }

    }
}
