package Inheritance002;

public class Member extends Person {

    public Member(String name, String id) {
        super(name, id);
    }

    public void borrowBook(Library library, Book book) {
        library.loanBook(this, book);
    }

    public void returnBook(Library library, Book book) {
        library.returnBook(this, book);
    }
}
