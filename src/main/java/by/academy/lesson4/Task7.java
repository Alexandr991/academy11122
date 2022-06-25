package by.academy.lesson4;
/*
 * Ввести с клавиатуры 10 пар чисел. сравнить числа в каждой паре и напечатать большие из них.
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] arg) {
        int a;
        int b;
        Scanner scan = new Scanner(System.in);
        System.out.println(" You need to enter 10 couples of numbers:");

        for (int i = 1; i < 10; i++) {
            System.out.println("Enter next couple of numbers");
            System.out.println("Enter first number:");
            a = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter second number:");
            b = scan.nextInt();
            scan.nextLine();
            if (a > b) {
                System.out.println("Max number from couple is: " + a);
            } else {
                System.out.println("Max number from couple is: " + b);
            }

            i++;
        }

    }
}
