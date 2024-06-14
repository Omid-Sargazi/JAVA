package OnlineVisit;

import java.util.Date;

public class Patient extends User {
    private String phoneNumber;

    public Patient(int userID, String username, String password, String email, int id, String name, Date birthDate,
            String phoneNumber) {
        super(userID, username, password, email, id, name);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getRole() {
        // TODO Auto-generated method stub
        return "Patient";

    }
}
