package SOLID.OnlineShopping;

public class ElectronicProduct extends Product {

    private String brand;
    private String model;

    public ElectronicProduct(String name, double price, Category category, String brand, String model) {
        super(name, price, category);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "ElectronicProduct [brand=" + brand + ", model=" + model + "]";
    }

}
