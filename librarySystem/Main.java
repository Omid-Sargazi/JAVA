package librarySystem;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("George Orwell");
        Author author2 = new Author("J.K. Rowling");

        Publisher publisher1 = new Publisher("Secker & Warburg");
        Publisher publisher2 = new Publisher("Bloomsbury");

        Book book1 = new Book("1984", author1, publisher1);
        Book book2 = new Book("Animal Farm", author1, publisher1);
        Book book3 = new Book("Harry Potter and the Philosopher's Stone", author2, publisher2);

        author1.addBook(book1);
        author1.addBook(book2);
        author2.addBook(book3);

        // Adding books to publishers
        publisher1.addBook(book1);
        publisher1.addBook(book2);
        publisher2.addBook(book3);

        // Creating a library and adding books to it
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        System.out.println(library);

        for (Book book : library.getBooks()) {
            System.out.println(book);
        }

        System.out.println(author1);
        System.out.println(author2);

        System.out.println(publisher1);
        System.out.println(publisher2);

    }
}
