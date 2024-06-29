package OOPAndSOLID;

public class Library {
    public static void main(String[] args) {
        User usr = new Member("omid", "123");
        User librarian = new Librarian("Saeed", "147");

        Book book = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        usr.borrowBook(book);

        librarian.borrowBook(book);

    }
}
