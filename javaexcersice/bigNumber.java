package javaexcersice;

public class bigNumber {
    public static void main(String[] args) {
        System.out.println("Big Number");
        // bignumber();
        AddTwoNumber();
    }

    public static void bignumber() {
        // int A[] = { 1, 2, 0, 0, 9, 9, 9, 9, 9, 9, 0, 0, 0, 0, 0 };
        int A[];
        A = new int[50000];
        A[0] = 1;
        int cA = 1;
        int n = 99;
        int q = 0;
        for (int y = 1; y <= 10000; y++) {
            for (int x = 0; x <= cA; x++) {
                int t = (A[x] * y + q);
                A[x] = t % 10;
                q = t / 10;
                // System.out.println("" + q + "q");
            }
            while (q > 0) {
                cA++;
                A[cA] = q % 10;
                q = q / 10;
            }
            if (y % 100 == 0) {
                System.out.println(q);
            }
        }
        for (int i = cA; i >= 0; i--) {
            System.out.print(A[i]);
        }

    }

    public static void AddTwoNumber() {
        int A[] = { 1, 2, 3, 4, 5, 6, 7 };
        int B[] = { 1, 2, 3, 4, 5, 6, 7 };
        int cA = A.length;
        int cB = B.length;
        int C[] = new int[cA + cB];

        int max = cA;
        if (cA > max) {
            for (int x = cB; x < max; x++) {
                B[x] = 0;
                max = cA;
            }
        }

        if (cB > max) {
            max = cB;
            for (int x = cA; x < max; x++) {
                A[x] = 0;
                max = cB;
            }
        }

        int q = 0;
        for (int x = 0; x < max; x++) {
            C[x] = ((A[x] + B[x]) + q) % 10;
            q = ((A[x] + B[x]) + q) / 10;
        }
        if (q >= 0) {
            C[max] = q;
        }
        for (int x = 0; x < max + 1; x++) {
            System.out.print("" + C[x] + ",");
        }
    }
}
