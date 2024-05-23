package glib;

public class Main {
    public static void main(String[] args) {

        FileManager x = new FileManager("Books.text");
        x.createFile();
        x.appendRow("Row1: omid");
        x.appendRow("Row2: Saragzi");
        x.appendRow("Row3: the best Developer");
        x.Clear();
        x.appendRow("Row4: around the world...");
        x.appendRow("Row5: and Iran");

        System.out.println("Hello");
    }
}
