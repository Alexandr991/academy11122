package by.academy.lesson3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int a;
        int b;
        int average;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number a :");
        a = scan.nextInt();
        System.out.println("Enter number b :");
        b = scan.nextInt();
        if (a > b) {
            System.out.println("Max number:" + a + "\n" + "Min number:" + b);
        } else if (a == b) {
            System.out.println("The numbers are equal." + "\n" + "Max value :" + a);
        } else {
            System.out.println("Max number:" + b + "\n" + "Min number:" + a);
        }
        average = (a + b) / 2;
        System.out.println("Average value:" + average);
        scan.close();
    }
}

