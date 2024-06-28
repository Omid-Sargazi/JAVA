package SOLID.LibrarySystem.LibrarySystemWithFactory;

public class Member implements User {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("User: " + name + ", Type: Member");
    }
}
