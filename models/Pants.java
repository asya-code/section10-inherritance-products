package models;

import java.util.Objects;

public class Pants extends Product implements Discountable {
        private int waist;

        public Pants(int waist, double price, String color, String brand) {
            super(price, color, brand);
            this.waist = waist;
        }

        public Pants(Pants source) {
            super(source);
            this.waist = source.waist;
        }

        public int getWaist() {
            return waist;
        }

        public void setWaist(int waist) {
                this.waist = waist;
        }

    @Override
    public void discount() {
        super.setPrice(super.getPrice()/2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pants pants)) return false;
        return waist == pants.waist
                && super.getPrice() == pants.getPrice()
                && super.getColor().equals(pants.getColor())
                && super.getBrand().equals(pants.getBrand());

    }

    @Override
    public int hashCode() {
        return Objects.hash(waist, super.getPrice(), super.getColor(), super.getBrand());
    }

    @Override
    public String toString() {
        return "Pants{" +
                "waist=" + getWaist() + "'" +
                "price='" + super.getPrice() + "'" +
                "color='" + super.getColor() + "'" +
                "brand='" + super.getBrand() + "'" +
                '}';
    }

    @Override
    public void fold() {
        System.out.println("Hold pants upright \n" +
                "Fold one leg over the other \n" +
                "Fold pants from bottom in thirds");
    }
}