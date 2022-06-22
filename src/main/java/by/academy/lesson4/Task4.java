package by.academy.lesson4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] arg) {
        int negative = 0;
        int positive = 0;
        int zero = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter next number:");
            int number = scan.nextInt();
            if (number < 0) {
                negative++;
            } else if (number == 0) {
                zero++;
            } else {
                positive++;
            }
        }
        System.out.println(" You entered negative:" + negative + " numbers.");
        System.out.println(" You entered positive:" + positive + " numbers.");
        System.out.println(" You entered zero:" + zero + " numbers.");
        scan.close();
    }
}
