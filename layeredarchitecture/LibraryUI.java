package layeredarchitecture;

import java.util.Scanner;

public class LibraryUI {
    private LibraryController controller = new LibraryController();

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    borrowBook(scanner);
                    break;
                case 4:
                    returnBook(scanner);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    private void addBook(Scanner scanner) {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        controller.addBook(title, author, isbn);
    }

    private void viewBooks() {
        for (Book book : controller.viewBooks()) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: "
                    + book.getIsbn() + ", Available: " + book.isAvailable());
        }
    }

    private void borrowBook(Scanner scanner) {
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter member name: ");
        String memberName = scanner.nextLine();
        System.out.print("Enter member ID: ");
        String memberId = scanner.nextLine();
        Member member = new Member(memberName, memberId);
        controller.borrowBook(isbn, member);
    }

    private void returnBook(Scanner scanner) {
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        controller.returnBook(isbn);
    }

    public static void main(String[] args) {
        LibraryUI ui = new LibraryUI();
        ui.showMenu();
    }
}
