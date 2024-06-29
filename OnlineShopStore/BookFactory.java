package OnlineShopStore;

public class BookFactory implements ProductFactory {
    @Override
    public Product createProduct(String name, double price) {
        // TODO Auto-generated method stub
        return new Book(name, price);
    }
}
