package by.academy.lesson3;

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = scan.next();                                  /*   next.line() всю строку,  next() до пробела    */
        System.out.println("Your string:" + str);
        System.out.println("Enter new String:");
        if (scan.hasNextInt()) {
            int str2 = scan.nextInt();
            System.out.println("Your string:" + str2);
        } else {
            String str2 = scan.next();
            System.out.println("Your string:" + str2);
        }
        System.out.println("Enter month:");
        String month = scan.next();
        month = month.toLowerCase();
        switch (month) {
            case "january" -> System.out.println("1 month");
            case "february" -> System.out.println("2 month");
            case "march" -> System.out.println("3 month");
            case "april" -> System.out.println("4 month");
            case "may" -> System.out.println("5 month");
            case "june" -> System.out.println("6 month");
            default -> System.out.println("It's not a month!");
        }
        scan.close();
    }
}
