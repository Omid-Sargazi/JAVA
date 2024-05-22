package string;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class fileManager {
    public static void main(String[] args) {
        int p = 100000;
        System.out.println("Hello");
        File f1 = new File("./ " + p + ".txt");

        int A[] = new int[1000000];
        int cA = 1;
        A[0] = 1;
        for (int i = 1; i <= p; i++) {
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
            if (i % 10000 == 0) {
                File f2 = new File("./" + i + ".txt");

                try {
                    PrintWriter outfile2 = new PrintWriter(f2);
                    // outfile.println(" Hi Omid");
                    // outfile.println("\n" + " Hi World");

                    for (int j = cA - 1; j >= 0; j--) {
                        outfile2.print("" + A[j]);
                        // System.out.println("" + j);
                    }
                    outfile2.close();
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        // for (int j = cA - 1; j >= 0; j--) {
        // System.out.print("" + A[j]);
        // // System.out.println("" + j);
        // }

    }
}
