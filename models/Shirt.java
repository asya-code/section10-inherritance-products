package models;

import java.util.Objects;

public class Shirt extends Product {
    /**
     * Limiting the number of values for size:
     * introduce enum variable Size and change return statement
     * from String (which can be anything) to enum Size (which is limited)
     *
     * the constructor, getters and setters also have to be updated accordingly
     */
    public enum Size {
        SMALL, MEDIUM, LARGE
    }
    private Size size;

    public Shirt(Size size, double price, String color, String brand) {
        super(price, color, brand);
        this.size = size;
    }

    public Shirt(Shirt source) {
        super(source);
        this.size = source.size;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void fold() {
        System.out.println("Lay shirt on the flat surface \n" +
                "Fold the shirt sideways \nBring sleeves in \n" +
                "Fold from bottom up");

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