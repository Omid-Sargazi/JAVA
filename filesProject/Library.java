package filesProject;

///Association relation
class Library {
    String name;

    Library(String name) {
        this.name = name;
    }
}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    void borrowBook(Library library) {
        System.out.println(name + "borrows a book from" + library.name);
    }
}
