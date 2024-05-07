package javaexcersice;

class RotateArray {
    public static void main(String[] args) {
        System.out.println("" + "Rotate Array");

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
}