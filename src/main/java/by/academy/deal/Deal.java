package by.academy.deal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Deal {
    private User seller;
    private User buyer;
    //privat int index =0

    private Product[] products;
    public LocalDateTime buyTime = LocalDateTime.now();           ///?????
    public LocalDate deadLine = LocalDate.now();

    public Deal() {
        super();

    }
    /*
    public Deal () {
    super();
    this.products =new Product[10]
    }


    private void grow(){
    int newLength =(int) (products.length ==0 ?1: products.length*1.5)
    Product[] newProducts = new Product[newLength];
    System.arraycopy(products,0,newProducts,0, products.length);
    products =newProducts;
    }
     */


    public Deal(User seller, User buyer, Product[] products) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
        //this.index =products.length;
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
