package DesignPattern.DatabaseFactory;

public class MySQLDatabaseFactory extends DatabaseFactoryImpl {
    protected Database createDatabaseInstance(String url, String username, String password) {
        return new MySQLDatabase();
    }
}
