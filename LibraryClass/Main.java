package LibraryClass;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.registerUser("Omid", "123", "o@o.com");
        library.registerUser("Omid", "123", "o@o.com");
        User user1 = new User("omid", "om.@gmail.com", "258");
        library.login("Omid", "123");
        library.logout(1);
        System.out.println(user1);
    }
}
