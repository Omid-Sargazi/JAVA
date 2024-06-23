package SOLID.DataPersistence;

public class DatabaseDIP implements Storage {
    @Override
    public void save(String data) {
        System.out.println("Saving data to the database: " + data);
    }
}
