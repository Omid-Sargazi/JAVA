package gLib;

public class Mian {
    public static void main(String[] args) {

        txtFileManager file = new txtFileManager("books.txt");
        file.createFile();
        file.AppendRow("ROw:1 Omid Salam, you are going to one of the best programming around the world. ");
        file.AppendRow("ROw:2 Omid Salamsss, you are going to one of the best programming around the world. ");
        file.AppendRow("ROw:3 Omid Salamssssssss, you are going to one of the best programming around the world. ");
        file.AppendRow("ROw:4 Omid Salamssssssss, you are going to one of the best programming around the world. ");
        System.out.println("Library");

    }
}
