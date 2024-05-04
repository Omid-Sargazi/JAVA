package javaexcersice;

public class bigNumber {
    public static void main(String[] args) {
        System.out.println("Big Number");
        bignumber();
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
}
