package projectnew;

import java.util.Scanner; // Import the Scanner class

public class rotatelist {
    public static void main(String[] args) {
        System.out.println("RotateList");
        // rotateList();
        mostRepeatNumber();
    }

    public static void rotateList() {
        System.out.println("Enter numbers");
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        System.out.println(n);
        int A[] = new int[n];
        int temp = 0;
        for (int x = 0; x < n; x++) {
            System.out.print("[ Enter items of list" + x + "]");
            A[x] = input.nextInt();
        }
        for (int y = 0; y <= 2; y++) {
            temp = A[n - 1];
            for (int x = n - 1; x > 0; x--) {
                A[x] = A[x - 1];
            }
            A[0] = temp;
        }
        for (int x = 0; x < n; x++) {
            System.out.println("list of items are[" + "item:" + x + " is" + A[x] + "]");
        }
    }

    public static void mostRepeatNumber() {
        System.out.println("Enter length of Array:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        int p = 0;
        int max = 0;
        int maxnum = 0;
        /// get Array
        for (int x = 0; x < n; x++) {
            System.out.print("enter Array[" + x + "]: ");
            A[x] = input.nextInt();
        }
        for (int y = 0; y < n; y++) {
            p = 0;
            for (int x = 0; x < n; x++) {
                if (A[y] == A[x]) {
                    p++;
                }
            }

            if (p > max) {
                max = p;
                maxnum = A[y];

            }
        }
        System.out.println("is Repeated " + maxnum + " " + max + " times ");

        for (int y = 0; y < n; y++) {
            p = 0;
            for (int x = y; x < n; x++) {
                if (A[y] == A[x])
                    p++;
            }
            B[y] = p;
            if (p == max)
                System.out.println("print all numbers the biggest: " + A[y]);
        }

        /// show Array
        for (int x = 0; x < n; x++) {
            System.out.print("A[" + x + "]= " + A[x] + " ");
        }
        for (int x = 0; x < n; x++) {
            System.out.print("B[" + x + "]= " + B[x] + " ");
        }

    }
}