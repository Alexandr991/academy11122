package by.academy.lesson7;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        Phone a1 = new Phone();
        System.out.println("Enter model:");
        a1.setModel(scan.next());
        System.out.println("Enter number:");
        a1.setNumber(scan.next());
        System.out.println("Enter weight:");
        a1.setWeight(scan.nextDouble());
        Phone a2 = new Phone();
        System.out.println("Enter model:");
        a2.setModel(scan.next());
        System.out.println("Enter number:");
        a2.setNumber(scan.next());
        System.out.println("Enter weight:");
        a2.setWeight(scan.nextDouble());
        Phone a3 = new Phone();
        System.out.println("Enter model:");
        a3.setModel(scan.next());
        System.out.println("Enter number:");
        a3.setNumber(scan.next());
        System.out.println("Enter weight:");
        a3.setWeight(scan.nextDouble());
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        a1.receiveCall("Bill");
        a1.receiveCall("Alex", "8 029-112 32 33");
        a1.sendMessage(a2.getNumber(), a3.getNumber());
    }
}
