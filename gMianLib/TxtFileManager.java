package gMianLib;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TxtFileManager {
    private String FileName;
    private int Rows;

    public TxtFileManager(String FileName) {
        this.FileName = "myFiles/" + FileName;
        Rows = 0;
    }

    public void deleteRow(int row) {
        if (row < 0 || row > Rows) {
            return;
        }
        String S[] = getArrayFromFile();
        String newS = "";
        for (int i = 0; i < S.length; i++) {
            if (i != row)
                newS = newS + S[i];
        }
        setIntoToFile(newS);
    }

    public int selectCount() {
        return Rows;
    }

    private void _updateRows() {
        int c = 0;
        try {
            Scanner input = new Scanner(new File(FileName));
            while (input.hasNextLine()) {
                input.nextLine();
                c++;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        Rows = c;
    }

    public void appendRow(String newRow) {
        String S = getFromFile();
        S = S + newRow;
        setIntoToFile(S);
    }

    private void setIntoToFile(String S) {
        try {
            File file = new File(FileName);
            // if (file.exists()) {
            // System.out.println("The file is exist");
            // }
            PrintWriter out = new PrintWriter(this.FileName);
            out.println(S);
            out.close();
            _updateRows();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private String[] getArrayFromFile() {
        File file = new File(this.FileName);
        String S[] = new String[Rows];
        int c = 0;
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                S[c++] = input.nextLine() + "\n";
            }
            input.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error occurred");
        }
        return S;
    }

    private String getFromFile() {
        File file = new File(this.FileName);
        String S = "";
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                S = S + input.nextLine() + "\n";
            }
            input.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error occurred");
        }
        return S;

    }

    public void createFile() {
        setIntoToFile("");
        Rows = 0;
    }

    public void clear() {
        createFile();
        Rows = 0;
    }
}
