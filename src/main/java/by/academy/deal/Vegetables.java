package by.academy.deal;

import java.util.Objects;

public class Vegetables extends Product {
    private boolean fresh;
    private double weight;

    public Vegetables() {
        super();

    }

    public Vegetables(String productName, int productPrice, boolean fresh, double weight) {
        super(productName, productPrice);
        this.fresh = fresh;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFresh() {
        return fresh;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vegetables)) return false;
        Vegetables that = (Vegetables) o;
        return fresh == that.fresh && Double.compare(that.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fresh, weight);
    }

    @Override
    public String toString() {
        return
                "Vegetables{" + " Product name: " + productName +
                        ". Fresh: " + fresh +
                        ". Weight: " + weight +
                        '}';
    }

    @Override
    public double discount() {
        if (fresh) {
            return 0.9;
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
