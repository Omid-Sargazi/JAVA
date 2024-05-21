package string;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {

        int A[] = { 1, 2, 3 };
        int q = 0;
        int B[] = { 4, 7 };
        int C[] = new int[A.length + B.length + 20];
        int cC = A.length;

        for (int i = 0; i < C.length; i++) {
            C[i] = 0;
        }

        for (int j = 0; j < B.length; j++) {
            q = 0;

            for (int i = 0; i < A.length; i++) {
                int t = B[j] * A[i] + q + C[j + i];
                C[j + i] = t % 10;
                q = t / 10;

            }

            while (q > 0) {
                C[cC++] = q % 10;
                q = q / 10;
            }
        }

        File file = new File("./data.txt");
        PrintWriter outfile = new PrintWriter(file);
        for (int j = cC - 1; j >= 0; j--) {
            System.out.print("" + C[j]);
            outfile.print(C[j]);
        }
        outfile.close();
    }
}
