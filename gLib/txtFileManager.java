package gLib;

import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; // Import the Scanner class
import java.io.FileWriter;
import java.io.IOException;

////////////////////////////////////////////////////////////
public class txtFileManager {
    private String fileName;

    public txtFileManager(String filename) {
        this.fileName = filename;
    }

    //////////////////////////////////////////////////////////// create file

    public void createFile() {
        File directory = new File("filesProject");
        if (!directory.exists()) {
            directory.mkdirs();
        }
        setIntoFile("");
    }

    public void clear() {
        createFile();
    }

    //////////////////////////////////////////////////////////// set into file

    private void setIntoFile(String S) {
        try {
            // Ensure the directory exists

            // Write to the file
            PrintWriter out = new PrintWriter("filesProject/" + this.fileName);
            out.write("" + S);
            out.close();

        } catch (FileNotFoundException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    //////////////////////////////////////////////////////////// get from file
    private String getFromFile() {
        StringBuilder S = new StringBuilder();
        try {
            File file = new File("filesProject" + this.fileName);
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                S.append(input.nextLine()).append("\n");
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return S.toString();
    }

    public void AppendRow(String newRow) {
        try {
            FileWriter fw = new FileWriter("filesProject/" + this.fileName, true);
            fw.write(newRow + "\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}