package javaexcersice;

class RotateArray {
    public static void main(String[] args) {
        System.out.println("" + "Rotate Array");
        rotateLeft();

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
}