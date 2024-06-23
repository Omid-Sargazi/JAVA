package SOLID.DataPersistence;

public class DataPersistence {
    private Database database = new Database();

    public void save(String data) {
        database.save(data);
    }
}
