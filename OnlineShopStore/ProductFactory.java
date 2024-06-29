package OnlineShopStore;

/**
 * ProductFactory
 */
public interface ProductFactory {
    Product createProduct(String name, double price);
}