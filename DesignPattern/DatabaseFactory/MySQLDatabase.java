package DesignPattern.DatabaseFactory;

public class MySQLDatabase implements Database {
    @Override
    public void query(String sql) {
        System.out.println("Executing query on MySQL database: " + sql);
    }
}
