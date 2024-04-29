package projectnew;

import java.util.Scanner;

public class mininarray {
    public static void main(String[] args) {

        InsertionSort();
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

            // System.out.print("" + A[x] + " ");
        }
        // bubbleSort();
    }

    public static void bubbleSort() {
        int[] A = { 10, 2, 3, 4, 5, 6, 4, 7, -100 };
        int n = A.length;
        int temp = 0;
        for (int x = 0; x < n; x++) {
            for (int y = x; y < n; y++) {
                if (A[x] > A[y]) {
                    temp = A[y];
                    A[y] = A[x];
                    A[x] = temp;
                }
            }
        }
        for (int x = 0; x < n; x++) {
            System.out.print("B: " + A[x]);
        }
    }

    public static void InsertionSort() {

        int[] A = { 10, 2, 3, 4, 5, 6, 4, 7, -100 };
        int n = A.length;
        for (int i = 1; i < n; i++) {
            // System.out.print("Insertion:" + i);
            int temp = A[i];
            int j = i - 1;
            while (A[j] > temp && j >= 0) {

                A[j + 1] = A[j];
                --j;
            }
            A[j + 1] = temp;
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.print("A[" + i + "]:" + A[i] + " ");
        }
    }
}
