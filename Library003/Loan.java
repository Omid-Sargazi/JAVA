package Library003;

import java.util.Date;

public class Loan {
    private Book book;
    private Member member;
    private Date issueDate;

    public Loan(Book book, Member member) {
        this.book = book;
        this.member = member;
        this.issueDate = new Date();
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public Date getIssueDate() {
        return issueDate;
    }
}
