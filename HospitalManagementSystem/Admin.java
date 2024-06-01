package HospitalManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Admin extends User {
    private Map<String, String> userRoles;

    public Admin(String id, String name, String email, String password) {
        super(id, name, email, password);
        this.userRoles = new HashMap<>();
    }

    public void manageRole(String userId, String role) {
        userRoles.put(userId, role);
        System.out.println("Role of user with Id" + userId + "has been set to" + role);
    }

    public String getRole(String userId) {
        return userRoles.get(userId);
    }
}
