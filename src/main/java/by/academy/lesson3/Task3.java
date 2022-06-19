package by.academy.lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] argds) {
        long a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer:");
        a = scan.nextLong();
        if (a % 2 == 0) {
            System.out.println("You've entered an even number.");
        } else {
            System.out.println("You've entered an odd number.");
        }
        scan.close();
    }
}
