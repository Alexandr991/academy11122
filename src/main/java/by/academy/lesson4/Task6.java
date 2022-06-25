package by.academy.lesson4;
/*
 * В сберкассу на трёхпроцентный вклад положили S рублей.Какой станет сумма вклада через N лет.
 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] arg) {
        double deposit;
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you sum of money:");
        deposit = scan.nextDouble();
        System.out.println("Enter number of years:");
        year = scan.nextInt();
        for (int i = 1; i <= year; i++) {
            deposit = deposit + (deposit * 0.03);

        }
        System.out.println("You deposit after " + year + " years will be " + deposit);

    }
}
