package javaexcersice;

import java.util.Scanner;

public class deleteRepeatNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter aRepeatNumber");

        int n = input.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        int cB = 0;

        for (int i = 0; i < n; i++) {
            System.err.print("Enter A[" + i + "]");
            A[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.err.print("A[" + i + "]= " + A[i] + "  ");
        }

        for (int x = 0; x < n; x++) {
            int flag = 0;
            for (int y = 0; y < cB; y++) {
                if (A[x] == B[y]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                B[cB++] = A[x];
            }
        }
        for (int i = 0; i < cB; i++) {
            System.err.print("B[" + i + "]= " + B[i] + "  ");
        }

    }// end of main
}// emd of class
