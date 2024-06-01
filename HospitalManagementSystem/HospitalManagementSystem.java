package HospitalManagementSystem;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Admin admin = new Admin("1", "Alice", "alice@example.com", "password123");
        admin.manageRole("o", "2");
        System.out.println(admin.getPassword());
    }
}
