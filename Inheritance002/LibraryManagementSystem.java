package Inheritance002;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Librarian librarian = new Librarian("Alice", "L001");

        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        librarian.addBook(library, book1);
        librarian.addBook(library, book2);

        System.out.println("Books in library:");
        library.displayBooks();

        Member member = new Member("John Doe", "M001");
        member.borrowBook(library, book1);

        member.borrowBook(library, book1);

        // Display books in library after borrowing
        System.out.println("\nBooks in library after borrowing:");
        library.displayBooks();

        // Member returns a book
        member.returnBook(library, book1);

        // Display books in library after returning
        System.out.println("\nBooks in library after returning:");
        library.displayBooks();

    }
}
