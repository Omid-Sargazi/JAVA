package string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // for (int i = 0; i < 255; i++) {
        // char c = (char) i;
        // System.out.println("" + i + ":" + c);
        // }
        // searchString();
        // stringWork();
        MultipelTwoArray();

    }

    static void searchString() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter S1: ");
        String s1 = input.nextLine();

        System.out.println("Enter S2:");
        String s2 = input.nextLine();

        int is1 = 0;
        int c = 0;
        while (is1 <= s1.length() - s2.length()) {
            int isFound = 1;
            for (int x = 0; x < s2.length(); x++) {
                if (s1.charAt(is1 + x) != s2.charAt(x)) {
                    isFound = 0;
                    break;
                }
            }
            if (isFound == 0) {
                is1++;
            } else if (isFound == 1) {
                System.out.println(is1);
                is1 += s2.length();
            }
        } // end of WHILE

    }

    static void stringWork() {
        // String s1 = "Hello I am Omid Sargazi who is a developer around the world";
        String s1 = "sOmid Omid   sOmid Saeed Omid ooooOmid";
        String s2 = "Omid";
        String s3 = s1 + s2;
        int c = s1.length() - s2.length();

        System.out.println(s1.length() - s2.length() + "");
        for (int i = 0; i < s1.length(); i++) {
            int flag = 1;
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i + j) != s2.charAt(j))

                {
                    flag = 0;
                    break;
                }

            }
            if (flag == 1) {
                System.out.println(i + "Start ");
            }

        }

    }

    static void MultipelTwoArray() {
        int A[] = { 1, 3, 4, 5, 6, };
        // int A[] = { 1, 3 };
        int B[] = { 11, 2, 3, 4, 5, 6, 7, 8, 9,
        };
        // int B[] = { 9, 2 };
        int cA = A.length;
        int cB = B.length;
        int C[] = new int[cA + cB];
        for (int i = 0; i < cA; i++) {
            C[i] = 0;
        }
        int q = 0;
        int cC = cA;
        for (int i = 0; i < cA; i++) {
            int temp = A[i] * B[0] + q;
            C[i] = temp % 10;
            q = temp / 10;

        }
        if (q > 0) {
            C[cC++] = q % 10;
        }
        for (int i = cC - 1; i >= 0; i--) {
            System.out.println("" + C[i] + "");
        }
    }
}