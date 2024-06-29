package OnlineShopStore;

public class ElectronicFactory implements ProductFactory {
    @Override
    public Product createProduct(String name, double price) {
        // TODO Auto-generated method stub
        return new Electronic(name, price);
    }
}
