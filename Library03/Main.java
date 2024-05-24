package Library03;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Book 1", "Author 1");
        Book book2 = new Book("Book 2", "Author 2");

        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("Member 1");
        Member member2 = new Member("Member 2");
        library.addMember(member1);
        library.addMember(member2);

        library.loanBook(member1, book1);
        library.returnBook(member1, book1);
        library.loanBook(member2, book2);
        library.returnBook(member2, book2);
    }
}
