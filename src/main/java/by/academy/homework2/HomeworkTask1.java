package by.academy.homework2;

import java.util.Scanner;


public class HomeworkTask1 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first word.");
        String str1 = scan.nextLine();
        System.out.println("Enter the second word.");
        String str2 = scan.nextLine();
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        if (array1.length != array2.length) {
            System.out.println("Your words are different!");
        } else {
            char[] array3 = new char[array1.length + array2.length];
            int count = 0;
            for (int i = 0; i < array1.length; i++) {
                array3[i] = array1[i];
                count++;
            }
            for (int j = 0; j < array2.length; j++) {
                array3[count++] = array2[j];
            }
            int result = 0;
            for (int i : array3) {
                result ^= i;
            }
            System.out.println();
            if (result == 0) {
                System.out.println("Your words the same.");
            } else {
                System.out.println("Your words are different.");
            }
        }
        scan.close();
    }
}

