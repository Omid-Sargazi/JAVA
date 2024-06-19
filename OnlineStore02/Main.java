package OnlineStore02;

public class Main {
    public static void main(String[] args) {
        User user = new User("001", "John", "o@o.com", "123456");
        Vendor vendor = new Vendor("0010", "saeed", "Q2Q.com", "021");
        Product product01 = new Product("0001", "Iphone", "Model 15", 100.2, 150, vendor);
        System.out.println("user: " + vendor);
        System.out.println("user: " + user);
        System.out.println("user: " + product01);
    }
}
