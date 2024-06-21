package MainLibrarySOLID;

public class User {
    private String userId;
    private String name;
    private String email;
    private String password;
    private List<Loan> borrowingHistory;

    // Constructor
    public User(String userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.borrowingHistory = new ArrayList<>();
    }

    // Getters and Setters
    // Other methods like updateProfile, changePassword, etc.
}
