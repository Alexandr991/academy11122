package by.academy.deal;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);
        User buyer = new User();
        System.out.println("Enter buyer's name: ");
        buyer.setUserName(scan.next());
        System.out.println("Enter buyer's money: ");
        buyer.setUserMoney(scan.nextDouble());
        User seller = new User();
        System.out.println("Enter seller's name: ");
        seller.setUserName(scan.next());
        System.out.println("Enter seller's money: ");
        seller.setUserMoney(scan.nextDouble());

        Product[] products = new Product[5];
        products[0] = new Fruits("Apple", 15, "red", true);
        products[1] = new Vegetables("Cucumber", 7, true, 10);
        products[2] = new Fruits("Banana", 19, "yellow", true);
        products[3] = new Vegetables("Onion", 3, true, 5);
        products[4] = new Fruits("Watermelon", 25, "green", false);
        Product[] basket = new Product[5];
        int basketProductIndex = 0;
        System.out.println("Select the products you want to buy.");
        for (Product product : products) {
            System.out.println("If you want to add product print 'y' else print 'n'.");
            System.out.println(" Product name:" + product.getProductName()
                    + ". Product price: " + product.getProductPrice());
            if (scan.next().equals("y")) {
                basket[basketProductIndex] = product;
                System.out.println("Enter quantity of " + product.getProductName());
                basket[basketProductIndex].setQuantity(scan.nextInt());
                basketProductIndex++;
            } else {
                // для возможного другого условия;
            }
        }
        //___________________________________________________________________________
        Deal deal1 = new Deal(seller, buyer, basket);

        System.out.println("Would you like to change your set of products?" + "\n"
                + "Enter 'y' or 'n'.");
        while (scan.next().equals("y")) {
            System.out.println("Would you like to add product or remove?" + "\n"
                    + "Enter 'add' for adding or 'remove' for removing.");
            if (scan.next().equals("add")) {
                for (int i = 0; i < products.length; i++) {
                    System.out.println("Number of product: " + (i + 1) + " Product name: " + products[i].getProductName());
                }
                int yNum = -10;             // default product index for adding in basket
                while (yNum != 0) {
                    System.out.println("Enter number of product for adding or enter '0' to Exit.");

                    if (scan.hasNextInt()) {
                        yNum = scan.nextInt();
                        if (yNum == 0) {
                            break;
                        } else if (yNum >= 1 && yNum <= products.length) {
                            deal1.addProduct(basketProductIndex, yNum, basket, products);
                            System.out.println("Enter quantity of product.");
                            basket[basketProductIndex].setQuantity(scan.nextInt());
                        }
                    }

                }

            }
            //remove products from basket
            else {
                for (int i = 0; i < basket.length; i++) {
                    if (basket[i] == null) {
                        continue;
                    } else {
                        System.out.println("Number of product: " + (i + 1) + " Product name: " + basket[i].getProductName());
                    }
                }
                int yNum = -10;
                while (yNum != 0) {
                    System.out.println("Enter number of product for removing or enter '0' to Exit.");

                    if (scan.hasNextInt()) {
                        yNum = scan.nextInt();
                        if (yNum == 0) {
                            break;
                        } else if ((yNum - 1) >= 0 && yNum <= basketProductIndex) {
                            deal1.removeProduct(yNum, basket);

                        }
                    }

                }

            }


            System.out.println("Would you like to change your basket again? Enter 'y' or 'n':");
        }

        deal1.bill(basket);
        System.out.println();
        deal1.deal(buyer, seller, basket);


        //_____________________________________________________________________________

        System.out.println("Enter date of your birthday in format: dd/MM/yyyy or dd-MM-yyyy");
        buyer.setDateOfBirthday(scan.next());
        SomeDate myBirthdayDate = new SomeDate();
        if (!(myBirthdayDate.dateCheck(buyer.getDateOfBirthday()))) {
            buyer.setDateOfBirthday(null);
        }
        Validator myPhoneNumber = new BelarusPhoneValidator();
        System.out.println("Enter your phone number:");
        buyer.setPhone(scan.next());
        if (!(myPhoneNumber.isValid(buyer.getPhone()))) {
            buyer.setPhone(null);
        }
//        Validator myPhoneNumber2 = new AmericanPhoneValidator();
//        System.out.println("Enter your phone number:");
//        myPhoneNumber2.isValid(scan.next());
        Validator myEmail = new EmailValidator();
        System.out.println("Enter your email: ");
        buyer.setEmail(scan.next());
        if (!(myEmail.isValid(buyer.getEmail()))) {
            buyer.setEmail(null);
        }
    }

}


