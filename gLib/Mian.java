package gLib;

public class Mian {
    public static void main(String[] args) {

        txtFileManager file = new txtFileManager("books.txt");
        file.createFile();
        file.AppendRow("Omid Salam, you are going to one of the best programming around the world. ");
        file.AppendRow("Omid Salamsss, you are going to one of the best programming around the world. ");
        file.AppendRow("Omid Salamssssssss, you are going to one of the best programming around the world. ");
        System.out.println("Library");

    }
}
