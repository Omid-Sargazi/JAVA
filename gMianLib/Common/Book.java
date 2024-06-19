package gMianLib.Common;

public class Book {
    private String BNO;
    private String Title;
    private int Pages;
    private String Subject;
    private String Author;

    public String getBNO() {
        return BNO;
    }

    public void setBNO(String bNO) {
        BNO = bNO;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getPages() {
        return Pages;
    }

    public void setPages(int pages) {
        Pages = pages;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

}
