package SOLID.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Effective Java");
        library.addBook("Clean Code");
        library.lendBook("Effective Java", "Alice");
        library.lendBook("Java Concurrency in Practice", "Bob");

        library.returnBook("Effective Java");
        library.returnBook("Clean Code");
    }
}
