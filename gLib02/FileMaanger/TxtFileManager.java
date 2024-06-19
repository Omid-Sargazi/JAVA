package gLib02.FileMaanger;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

import StringProblems.StrToInt;

public class TxtFileManager {
    private String FileName;
    private int Rows;

    public TxtFileManager(String filename) {
        this.FileName = filename;
        Rows = 0;
    }

    public void deleteRow(int row) {
        if (row <= 0 && row > Rows) {
            return;
        }
        try {
            String S[] = getArrayFromFile();
            String newS = "";
            for (int i = 0; i < S.length; i++) {
                if (i != row - 1) {
                    newS = newS + S[i];
                }
            }
            setIntoFile(newS);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public int selectCount() {
        return Rows;
    }

    private void _updateRows() {
        int c = 0;

        try {
            File file = new File("myFiles/" + this.FileName);
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                input.nextLine();
                c++;
            }
            input.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

        Rows = c;
    }

    public void appendRow(String newRow) {
        String S = "";
        try {
            S = getFromFile();
            S = S + newRow;
            setIntoFile(S);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void setIntoFile(String S) {
        try {
            PrintWriter out = new PrintWriter("myFiles/" + this.FileName);
            out.print(S);
            out.close();
            _updateRows();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public String[] getArrayFromFile() throws FileNotFoundException {

        File file = new File("myFiles/" + this.FileName);
        String S[] = new String[Rows];
        int cs = 0;
        Scanner input = new Scanner(file);

        while (input.hasNextLine()) {
            S[cs++] = input.nextLine() + "\n";
        }

        input.close();
        return S;

    }

    private String getFromFile() throws FileNotFoundException {

        File file = new File("myFiles/" + this.FileName);
        String S = "";
        Scanner input = new Scanner(file);

        while (input.hasNextLine()) {
            S += input.nextLine() + "\n";
        }

        input.close();
        return S;

    }

    public void createFile() {
        setIntoFile("");
        Rows = 0;
    }

    public void Clear() {
        createFile();
        Rows = 0;
    }
}
