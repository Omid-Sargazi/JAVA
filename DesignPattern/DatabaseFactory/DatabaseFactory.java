package DesignPattern.DatabaseFactory;

public interface DatabaseFactory {
    Database createDatabase(String url, String username, String password);
}
