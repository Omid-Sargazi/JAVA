package string;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class readFile {

    public static void main(String[] args) throws FileNotFoundException {

        File f1 = new File("./a1.txt");
        // PrintWriter outfile = new PrintWriter(f1);
        // outfile.print("omid");
        // outfile.close();
        int A[] = new int[1000];
        int cA = 0;
        Scanner infile = new Scanner(f1);
        while (infile.hasNext()) {
            int n = infile.nextInt();
            System.out.println("" + n);
            A[cA++] = n;
        }
        System.out.print("A= [");

        for (int i = 0; i < cA; i++) {
            System.out.print(+A[i] + ",");
        }
        System.out.print("]");

        File f2 = new File("./aa2.txt");
        PrintWriter outfile2 = new PrintWriter(f2);
        for (int i = 0; i < cA; i++) {
            outfile2.print(A[i] + ",");
        }

        outfile2.close();

    }

}
