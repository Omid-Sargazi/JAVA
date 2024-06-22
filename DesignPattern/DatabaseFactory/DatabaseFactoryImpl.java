package DesignPattern.DatabaseFactory;

abstract class DatabaseFactoryImpl implements DatabaseFactory {
    protected abstract Database createDatabaseInstance(String url, String username, String password);

    @Override
    public Database createDatabase(String url, String username, String password) {
        Database database = createDatabaseInstance(url, username, password);
        // Perform additional setup or configuration
        database.query("SELECT 1"); // Initialize the database
        return database;
    }
}
