package models;

public abstract class Product implements Comparable <Product> {
    private double price;
    private String color;
    private String brand;


    public Product(double price, String color, String brand){
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    public Product(Product source){
        this.price = source.price;
        this.color = source.color;
        this.brand = source.brand;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void fold();

    @Override
    public int compareTo(Product specifiedObject) {
        String className = this.getClass().getSimpleName();
        String sClassName = specifiedObject.getClass().getSimpleName();
        if (!(className.equals(sClassName))) {
            return className.compareTo((sClassName));
        }
        return (int) Double.compare(this.getPrice(), specifiedObject.getPrice());
    }
}
