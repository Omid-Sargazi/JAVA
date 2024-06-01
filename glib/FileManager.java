package glib;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    private String FileName;

    public FileManager(String FileName) {
        this.FileName = "./glib/myFiles/" + FileName;
    }
    //////////////////////////////////////////// createFile

    public void createFile() {
        // try {
        // File f1 = new File(this.FileName);

        // if (f1.createNewFile()) {
        // System.out.println("File created: " + f1.getName());
        // } else {
        // FileWriter myfile = new FileWriter(f1);
        // myfile.write("Hi world");
        // myfile.close();
        // System.out.println("File already exists.");

        // }

        // } catch (IOException e) {
        // System.out.println("An error occurred.");
        // e.printStackTrace();
        // }
        setIntoFile("");
    }

    //////////////////////////////////////////// Clear Function

    public void Clear() {
        createFile();
    }

    // public int SelectCount() {

    }

    //////////////////////////////////////////// AddRow Function

    public void appendRow(String newRow) {
        String s = getFromFile();
        if (s == "")
            s = newRow;
        else
            s = s + "\n" + newRow;

        setIntoFile(s);

    }
    //////////////////////////////////////////// setIntoFile Function

    private void setIntoFile(String s) {
        try {
            FileWriter out = new FileWriter(this.FileName);
            out.write("" + s);
            out.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    //////////////////////////////////////////// getFromFile Function

    private String getFromFile() {
        File file = new File(this.FileName);
        String s = "";
        try {

            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                if (s == "")
                    s = input.nextLine();
                else
                    s = s + "\n" + input.nextLine();
                System.out.println(s + "   ...data from file...");
            }
            input.close();
            return s;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return s;
    }

}
