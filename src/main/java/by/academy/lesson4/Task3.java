package by.academy.lesson4;
/*
 * Cоставьте программу, которая вычисляет произведение чисел от 1 до n. Значение n
 * вводится с клавиатуры.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] arg) {
        int i = 1;
        int prod = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = scan.nextInt();
        while (i < n) {
            prod *= i;
            i++;
        }
        System.out.println("Multiplication: " + prod);
    }
}
