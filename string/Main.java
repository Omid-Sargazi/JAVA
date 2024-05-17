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
        // MultipelTwoArray();
        // StringToNumber();
        ShowCharacter();

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

    // static void MultipelTwoArray() {
    // Scanner input = new Scanner(System.in);

    // System.out.print("\n Enter Number1: ");
    // String S1 = input.nextLine();

    // int A[] = new int[S1.length()];
    // int cA = A.length;
    // for (int i = 0; i < cA; i++) {
    // A[i] = S1.charAt(cA - i - 1) - '0';
    // }

    // System.out.print("\n Enter Number2: ");
    // String S2 = input.nextLine();
    // int cB = S2.length();

    // int B[] = new int[S2.length()];
    // for (int i = 0; i < cB; i++) {
    // B[i] = S2.charAt(cB - i - 1) - '0';
    // }

    // System.out.print("Number1 is: ");
    // for (int i = 0; i < S2.length(); i++) {
    // System.out.print(B[i]);
    // }

    // System.out.print(" Number2 is: ");
    // for (int i = 0; i < S1.length(); i++) {
    // System.out.print(A[i]);
    // }

    // int C[] = new int[cA + cB + 2];
    // for (int i = 0; i < C.length; i++) {
    // C[i] = 0;
    // }

    // int cC = cA;
    // for (int j = 0; j < cB; j++) {
    // int q = 0;
    // for (int i = 0; i < cA; i++) {
    // int t = A[i] * B[j] + q + C[i + j];
    // C[i + j] = t % 10;
    // q = t / 10;

    // }
    // cC++;
    // if (q > 0) {
    // C[cC++] = q % 10;
    // q = q / 10;
    // }
    // }

    // System.out.print("\n");
    // for (int i = cC - 1; i >= 0; i--) {
    // System.out.print(" " + C[i]);
    // }
    // }

    static void StringToNumber() {
        String s = "123654";
        int n = 0;
        for (int x = 0; x < s.length(); x++) {
            System.out.println("x:" + (s.charAt(x) - '0'));
            n = n * 10 + (s.charAt(x) - '0');
        }
        System.out.println("n:" + n * 2);
    }

    static void ShowCharacter() {
        for (int i = 0; i < 255; i++) {
            char c = (char) i;
            System.out.println(i + " " + c);
        }
    }
}