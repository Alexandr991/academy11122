package by.academy.deal;

public abstract class Product {
    protected int productPrice;
    protected String productName;
    protected int quantity;


    public Product() {
        super();
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public Product(String productName, int productPrice) {
        this.productPrice = productPrice;
        this.productName = productName;
    }

    public Product(String productName, int productPrice, int quantity) {
        this.productPrice = productPrice;
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int price) {
        this.productPrice = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calcPrice() {
        return quantity * productPrice;
    }

    public double calcFinalPrice() {
        return quantity * (productPrice - (productPrice * (1 - discount())));

    }

    @Override
    public String toString() {
        return "Product{" +
                "Product name: '" + productName +
                " ', Product price: " + productPrice + '\'' +
                '}';
    }

    public abstract double discount();


}
