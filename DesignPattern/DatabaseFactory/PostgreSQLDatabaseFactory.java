package DesignPattern.DatabaseFactory;

public class PostgreSQLDatabaseFactory extends DatabaseFactoryImpl {
    protected Database createDatabaseInstance(String url, String username, String password) {
        return new PostgreSQLDatabase();
    }
}
