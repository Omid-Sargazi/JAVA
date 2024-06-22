package DesignPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Instance" + Logger.getInstance());
        System.out.println("Instance" + Logger.getInstance());
        Logger log = Logger.getInstance();
        log.log("omid");
    }
}
