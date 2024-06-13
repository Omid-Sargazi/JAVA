package OnlineStore;

public class Stockholder extends User {
    public Stockholder(String name, String email, String password) {
        super(name, email, password);
    }

    @Override
    public String toString() {
        return "Stockholder{" + super.toString() + "}";
    }
}
