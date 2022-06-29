package by.academy.homework2;

import java.util.Scanner;

public class HomeworkTask3 {
    public static void main(String[] arg) {
        String str1;
        String str2;
        String half1;
        String half2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first word:");
        str1 = scan.next();
        System.out.println("Enter the second word:");
        str2 = scan.next();
        half1 = str1.substring(0, str1.length() / 2);
        half2 = str2.substring(str2.length() / 2, str2.length());
        System.out.println("Your word from two halves: " +half1 + half2);
        scan.close();
    }
}
