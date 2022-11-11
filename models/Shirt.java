package models;

import java.util.Objects;

public class Shirt extends Product{
    private String size;

    public Shirt(String size, double price, String color, String brand) {
        super(price, color, brand);
        this.size = size;
    }

    public Shirt(Shirt source) {
        super(source);
        this.size = source.size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shirt shirt = (Shirt) o;
        return size.equals(shirt.size)
                && super.getPrice() == shirt.getPrice()
                && super.getColor().equals(shirt.getColor())
                && super.getBrand().equals(shirt.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, super.getPrice(), super.getColor(), super.getBrand());
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "size='" + getSize() + "'" +
                "price='" + super.getPrice() + "'" +
                "color='" + super.getColor() + "'" +
                "brand='" + super.getBrand() + "'" +
                '}';
    }
}