package DesignPattern.DatabaseFactory;

public class PostgreSQLDatabase implements Database {
    @Override
    public void query(String sql) {
        System.out.println("Executing query on PostgreSQL database: " + sql);
    }
}
