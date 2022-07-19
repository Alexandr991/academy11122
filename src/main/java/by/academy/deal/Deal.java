package by.academy.deal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Deal {
    private User seller;
    private User buyer;
    private int index = 0;

    private Product[] products;
    public LocalDateTime buyTime = LocalDateTime.now();
    public LocalDate deadLine = LocalDate.now();

    public Deal() {
        super();
        this.products = new Product[10];
    }

    private Product[] grow(Product[] basket) {
        int newLength = (int) (basket.length == 0 ? 1 : basket.length * 1.5);
        Product[] newProducts = new Product[newLength];
        System.arraycopy(basket, 0, newProducts, 0, basket.length);
        System.out.println(Arrays.toString(newProducts));
        return newProducts;
    }

    private void decrease(Product[] basket) {
        Product[] temp = new Product[basket.length];
        int count = 0;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                count++;

            } else {
                temp[i - count] = basket[i];
            }
        }
        Product[] newProducts = new Product[basket.length - count];
        System.arraycopy(temp, 0, newProducts, 0, newProducts.length);
        products = newProducts;

    }

    public Deal(User seller, User buyer, Product[] products) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
        this.index = products.length;
    }


    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void getBuyTime() {
        System.out.println(buyTime);
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public Product[] addProduct(int basketProductIndex, int yNum, Product[] basket, Product[] products) {
        if ((basketProductIndex) == basket.length) {

            basket = grow(basket);

        }
        basket[basketProductIndex++] = products[yNum - 1];
        System.out.println(Arrays.toString(basket));
        return basket;
    }


    public Product getProduct(int index) {
        return products[index];
    }


    public void removeProduct(int yNum, Product[] basket) {
        basket[yNum - 1] = null;
        decrease(basket);

    }

    public double fullPrice(Product[] products) {
        double result = 0;
        for (Product product : products) {
            if (product != null) {
                result += product.calcPrice();
            } else {
                continue;
            }
        }
        return result;
    }

    public double fullFinalPrice(Product[] products) {
        double result = 0;
        for (Product product : products) {
            if (product != null) {
                result += product.calcFinalPrice();
            } else {
                continue;
            }
        }
        return result;
    }

    public void deal(User seller, User buyer, Product[] products) {
        System.out.println("Deal:");
        System.out.println("Buyer name: " + buyer.getUserName());
        System.out.println("Seller name: " + seller.getUserName());
        double buyerMoney = buyer.getUserMoney() - fullFinalPrice(products);
        double sellerMoney = seller.getUserMoney() + fullFinalPrice(products);
        if (buyerMoney < 0) {
            System.out.println("Buyer doesn't have enough money.");
        } else {
            System.out.println("Buyer's money after deal: " + buyerMoney);
            System.out.println("Seller's money after deal: " + sellerMoney);
            System.out.printf("Time of deal: " + buyTime + "\n");
            System.out.println("Deadline is today +10 days: " + deadLine.plusDays(10));
        }

    }

    public void bill(Product[] products) {
        System.out.println("Bill:");
        for (Product product : products) {
            if (product != null) {
                System.out.println(" Product name:" + product.getProductName()
                        + ". Product price: " + product.getProductPrice()
                        + ". Quantity: " + product.getQuantity() + " Discount: "
                        + String.format("%.1f", (1 - product.discount()) * 100) + "%");

            } else {
                continue;
            }
        }
        System.out.printf("Time of deal: " + buyTime);
        System.out.println();
        System.out.println("Full price without discount: " + fullPrice(products));
        System.out.println("Full price with discount: " + fullFinalPrice(products));
    }

    @Override
    public String toString() {
        return "Deal{" +
                "Seller: " + seller +
                ". Buyer:" + buyer +
                ". Products: " + Arrays.toString(products) +
                '}';
    }
}
