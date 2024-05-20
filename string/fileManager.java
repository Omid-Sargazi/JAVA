package string;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class fileManager {
    public static void main(String[] args) {
        System.out.println("Hello");
        File f1 = new File("./a1.txt");
        try {
            PrintWriter outfile = new PrintWriter(f1);
            outfile.print(" Hi Omid");
            outfile.print("\n" + " Hi World");
            outfile.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
