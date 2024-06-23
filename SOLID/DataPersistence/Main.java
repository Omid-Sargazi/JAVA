package SOLID.DataPersistence;

public class Main {
    public static void main(String[] args) {
        Storage storage = new DatabaseDIP();

        DataPersistenceDIP database = new DataPersistenceDIP(storage);

        database.save("my data");
    }
}
