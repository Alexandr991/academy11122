package by.academy.lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] arg) {
        int x = 1;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = scan.nextInt();
        while (x <= n) {
            sum += x;
            x++;
        }
        scan.close();
        System.out.println("Sum n = " + sum);
    }
}
