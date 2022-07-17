package by.academy.deal;


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
        System.out.println("Choose products that you want to buy.");
        for (Product product : products) {
            System.out.println("If you want to add product print 'Y' else print 'N'.");
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
        Deal deal1 = new Deal(seller, buyer, basket);
        deal1.bill(basket);
        deal1.deal(buyer, seller, basket);
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
        Validator myPhoneNumber2 = new AmericanPhoneValidator();
        System.out.println("Enter your phone number:");
        myPhoneNumber2.isValid(scan.next());
        Validator myEmail = new EmailValidator();
        System.out.println("Enter your email: ");
        buyer.setEmail(scan.next());
        if (!(myEmail.isValid(buyer.getEmail()))) {
            buyer.setEmail(null);
        }


    }


//?????????????

//        Deal deal1 = new Deal(seller,buyer,products);

//        deal1.bill(products);
//        deal1.deal(buyer,seller,products);


//        ArrayList<Deal> deals = new ArrayList<>();
//        deals.add(deal1);
//        System.out.println(deals);


    // ??????????????????


//


}

