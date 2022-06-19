package by.academy.homework1;

import java.util.Scanner;

public class HomeworkTask1 {
    public static void main(String[] args) {
        byte age;
        long cost;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your cost.");
        cost = scan.nextLong();
        System.out.println("Enter your age.");
        age = scan.nextByte();
        if (cost < 100) {
            System.out.println("Your final cost with discount "
                    + (cost - (cost * 0.05)));
        } else if (cost < 200) {
            System.out.println("Your final cost with discount "
                    + (cost - (cost * 0.07)));
        } else if (cost < 300) {
            if (age > 18) {
                System.out.println("Your final cost with discount "
                        + (cost - (cost * 0.16)));
            } else {
                System.out.println("Your final cost with discount "
                        + (cost - (cost * 0.11)));
            }
        } else if (cost < 400) {
            System.out.println("Your final cost with discount "
                    + (cost - (cost * 0.15)));
        } else {
            System.out.println("Your final cost with discount "
                    + (cost - (cost * 0.2)));
        }
        scan.close();
    }
}
