package javaexcersice;

class RotateArray {
    public static void main(String[] args) {
        System.out.println("" + "Rotate Array");
        // rotateLeft();
        // deletePrimerNumber();
        // MaxRepeated();
        BigFactorial();

    }

    public static void rotateRight() {
        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 11, 13, 14, 112, 112, 113, 1000 };
        int n = A.length;
        int temp = 0;
        temp = A[n - 1];
        for (int x = n - 1; x >= 1; x--) {
            A[x] = A[x - 1];
        }
        A[0] = temp;

        for (int x = 0; x <= n - 1; x++) {
            System.out.print("" + A[x] + ",");
        }
    }

    public static void rotateLeft() {
        int A[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 };
        int n = A.length;
        int temp = 0;
        temp = A[0];
        for (int i = 0; i < n - 1; i++) {
            A[i] = A[i + 1];
        }
        A[n - 1] = temp;
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("A[" + i + "]:" + A[i] + " ");
        }
    }

    public static void deletePrimerNumber() {
        int A[] = { 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 };
        int n = A.length;
        int[] B = new int[n];
        int cA = n;
        int cB = 0;
        int iA = 0;
        while (iA < cA) {
            int flag = 0;
            for (int j = 1; j <= A[iA]; j++) {
                if (A[iA] % j == 0) {
                    flag++;
                }
            }
            if (flag != 2) {
                iA++;
            } else {
                B[cB++] = A[iA];
                for (int x = iA + 1; x < cA; x++) {
                    A[x - 1] = A[x];
                }
                cA--;
            }
        }
        for (int i = 0; i < cA; i++) {
            System.out.print("A[" + i + "]= " + A[i] + "  ");
        }
        System.out.println("\n================================");
        for (int i = 0; i < cB + 1; i++) {
            System.out.print("B[" + i + "]= " + B[i] + "  ");
        }
    }

    public static void MaxRepeated() {

        int A[] = { 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 1, 1, 1, 19, 2, 12, 15, 2, 3 };
        int n = A.length;
        int max = 0;
        int MN = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int x = 0; x < n; x++) {
                if (A[i] == A[x]) {
                    count++;
                }
            }
            if (count >= max) {
                max = count;
                MN = A[i];
            }

        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int x = i; x < n; x++) {
                if (A[i] == A[x]) {
                    count++;
                }
            }
            if (count == max) {
                System.out.print("" + A[i] + ", " + max);
            }
        }

        // System.out.println("" + max + " " + MN);

    }

    public static void BigFactorial() {
        // int[] A = { 1, 2, 3, 4, 5, 6, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        // };
        int A[] = new int[1000];
        int cA = 1;
        A[0] = 1;
        // int n = A.length;
        int num = 122;
        int q = 0;
        for (int x = 1; x <= A.length; x++) {
            for (int i = 0; i < cA; i++) {
                int t = ((A[i] * x) + q);
                A[i] = t % 10;
                q = t / 10;
            }
            if (q > 0) {
                A[cA++] = q % 10;
                q = q / 10;
            }
            if (x % 100 == 0) {
                System.out.println("" + x);
            }
        }
        for (int i = cA - 1; i >= 0; i--) {
            System.out.print("" + A[i] + "");
        }
    }
}