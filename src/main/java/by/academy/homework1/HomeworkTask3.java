package by.academy.homework1;

import java.util.Scanner;

public class HomeworkTask3 {
    public static void main(String[] args) {
        byte x;
        byte multiplication = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer from 1 to 10:");
        x = scan.nextByte();
        if (x <= 10 && x >= 0) {
            while (multiplication < 10) {
                multiplication++;
                System.out.println(x + " * " + (multiplication)
                        + " = " + (x * multiplication));
            }
        } else {
            System.out.println("You entered incorrect integer.");
        }
        scan.close();
    }
}
