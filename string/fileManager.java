package string;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class fileManager {
    public static void main(String[] args) {
        System.out.println("Hello");
        File f1 = new File("./a1.txt");

        int A[] = new int[1000];
        int cA = 1;
        A[0] = 1;
        for (int i = 1; i <= 10; i++) {
            int q = 0;
            for (int x = 0; x < cA; x++) {
                int t = A[x] * i + q;
                A[x] = t % 10;
                q = t / 10;
            }
            while (q > 0) {
                A[cA++] = q % 10;
                q = q / 10;
            }
        }

        for (int j = cA - 1; j >= 0; j--) {
            System.out.print("" + A[j]);
            // System.out.println("" + j);
        }

        try {
            PrintWriter outfile = new PrintWriter(f1);
            outfile.println(" Hi Omid");
            outfile.println("\n" + " Hi World");
            for (int j = cA - 1; j >= 0; j--) {
                outfile.print("" + A[j]);
                // System.out.println("" + j);
            }
            outfile.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
