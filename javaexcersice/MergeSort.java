package javaexcersice;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("MergeSort");
        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int B[] = { -3, -2, -1, 10, 11, 12, 13, 14, 15, 146 };
        int cA = A.length;
        int cB = B.length;
        int[] C;
        C = new int[cA + cB];
        int iA = 0;
        int iB = 0;
        int iC = 0;
        // System.out.print(" " + C.length + ",");
        while (iA < cA && iB < cB)
            if (A[iA] < B[iB])
                C[iC++] = A[iA++];
            else
                C[iC++] = B[iB++];
        if (iA == cA)
            for (int x = iB; x < cB; x++)
                C[iC++] = B[x];
        else
            for (int x = iA; x < cA; x++)
                C[iC++] = A[x];

        for (int x = 0; x < C.length; x++)

            System.out.print("" + C[x] + ",");
    }

}
