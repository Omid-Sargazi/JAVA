package DesignPattern.DatabaseFactory;

public class Main {
    public static void main(String[] args) {
        DatabaseFactory factory = new MySQLDatabaseFactory();
        Database database = factory.createDatabase("jdbc:mysql://localhost:3306/mydb", "root", "password");
        database.query("SELECT * FROM users"); // Output: Executing query on MySQL database: SELECT * FROM users

        factory = new PostgreSQLDatabaseFactory();
        database = factory.createDatabase("jdbc:postgresql://localhost:5432/mydb", "postgres", "password");
        database.query("SELECT * FROM users"); // Output: Executing query on PostgreSQL database: SELECT * FROM users
    }
}
