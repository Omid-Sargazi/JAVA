package SOLID.DataPersistence;

public class DataPersistenceDIP {
    private Storage storage;

    public DataPersistenceDIP(Storage storage) {
        this.storage = storage;
    }

    public void save(String data) {
        storage.save(data);
    }
}
