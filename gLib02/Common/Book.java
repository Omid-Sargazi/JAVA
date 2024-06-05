package gLib02.Common;

public class Book {
    private String BNO;
    private String Title;
    private String Author;
    private int pages;
    private String subject;

    public void setBNO(String bNO) {
        if (bNO.length() >= 3 && bNO.length() <= 10)
            BNO = bNO;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getBNO() {
        return BNO;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getPages() {
        return pages;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
