package ECommerceSystem;

public class ECommerceProductManager implements ProductManager {
    @Override
    public void addProduct(Product product) {
        // TODO Auto-generated method stub

        System.out.println("Product added: " + product.getName());

    }

    @Override
    public void removeProduct(Product product) {
        // TODO Auto-generated method stub

        System.out.println("Product removed: " + product.getName());

    }
}
