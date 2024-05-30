package gLib;

import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; // Import the Scanner class

////////////////////////////////////////////////////////////
public class txtFileManager {
    private String FileName;

    public txtFileManager(String filename) {
        this.FileName = filename;
    }

    //////////////////////////////////////////////////////////// create file

    public void createFile() {
        setIntoFile("");
    }

    public void clear() {
        createFile();
    }

    //////////////////////////////////////////////////////////// set into file

    private void setIntoFile(String S) {
        try {
            // Ensure the directory exists
            File directory = new File("filesProject");
            if (!directory.exists()) {
                directory.mkdirs();
            }
            // Write to the file
            PrintWriter out = new PrintWriter("filesProject/" + this.FileName);
            out.print(S);
            out.close();

        } catch (FileNotFoundException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    //////////////////////////////////////////////////////////// get from file
    private String getFromFile() {
        File file = new File(this.FileName);
        String S = "";
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                S = S + input.nextLine() + "\n";
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return S;
    }

    public void AppendRow(String newRow) {
        String S = getFromFile();
        S = S + "\n" + newRow;
        setIntoFile(S);
    }

}
