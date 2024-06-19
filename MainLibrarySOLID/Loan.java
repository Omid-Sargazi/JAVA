package MainLibrarySOLID;

import java.util.Date;

public class Loan {
    private String id;
    private Book book;
    private Member member;
    private Date loanDate;
    private Date returnDate;

    public Loan(String id, Book book, Member member) {
        this.id = id;
        this.book = book;
        this.member = member;
        this.loanDate = new Date();
        this.returnDate = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void returnBook() {
        this.returnDate = new Date();
        book.setAvailable(true);
    }

}
