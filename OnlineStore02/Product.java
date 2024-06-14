package OnlineStore02;

public class Product {
    private String productId;
    private String name;
    private String description;
    private double price;
    private int stockLevel;
    private Vendor vendor; // Association

    public Product(String productId, String name, String description, double price, int stockLevel, Vendor vendor) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockLevel = stockLevel;
        this.vendor = vendor;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", name=" + name + ", description=" + description + ", price="
                + price + ", stockLevel=" + stockLevel + ", vendor=" + vendor + ", getProductId()=" + getProductId()
                + ", getName()=" + getName() + ", getDescription()=" + getDescription() + ", getPrice()=" + getPrice()
                + ", getStockLevel()=" + getStockLevel() + ", getVendor()=" + getVendor() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

}
