package by.academy.deal;

import java.util.Objects;

public class Fruits extends Product {
    private String color;
    private boolean ripe;

    public Fruits() {
        super();

    }

    public Fruits(String productName, int productPrice, String color, boolean ripe) {
        super(productName, productPrice);
        this.color = color;
        this.ripe = ripe;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getRipe() {
        return ripe;
    }

    public void setRipe(boolean ripe) {
        this.ripe = ripe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruits)) return false;
        Fruits fruits = (Fruits) o;
        return Objects.equals(color, fruits.color) && Objects.equals(ripe, fruits.ripe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, ripe);
    }

    @Override
    public String toString() {
        return "Fruits{" + " Product name: " + productName +
                ". Color: '" + color + '\'' +
                ". Ripe: '" + ripe + '\'' +
                '}';
    }

    @Override
    public double discount() {
        if (color.equals("red")) {
            return 0.7;
        } else {
            return 1;
        }
    }

    @Override
    public double calcPrice() {
        return quantity * productPrice;
    }

    @Override
    public double calcFinalPrice() {
        return quantity * (productPrice - (productPrice * (1 - discount())));
    }
}
