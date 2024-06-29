package OnlineShopStore;

public class OnlineShop {
    private ProductFactory productFactory;

    public OnlineShop(ProductFactory productFactory) {
        this.productFactory = productFactory;
    }

    public void orderProduct(String name, double price) {
        Product product = productFactory.createProduct(name, price);
        System.out.println("Product Ordered: " + product.getName() + " with price: " + product.getPrice());

    }
}
