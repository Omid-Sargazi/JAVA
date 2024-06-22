package DesignPattern;

import java.sql.Connection;

public class DatabaseConnectionPool {
    private static DatabaseConnectionPool instance;

    private DatabaseConnectionPool() {
    }

    public static synchronized DatabaseConnectionPool getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionPool();
        }
        return instance;
    }

    public Connection getConnection() {
        return null;
    }
}
