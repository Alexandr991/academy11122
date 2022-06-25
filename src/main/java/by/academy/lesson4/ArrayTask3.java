package by.academy.lesson4;
/*
 * Создайте массив из 15 случайных целых чисел из отрезка [0;9].
 * Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и
 * выведете это количество на экран на отдельной строке.
 */

import java.util.Random;

public class ArrayTask3 {
    public static void main(String[] arg) {
        int count = 0;
        int[] myArray = new int[15];
        Random rand = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt(9);
            if (myArray[i] % 2 == 0) {
                count++;
            }
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        System.out.println("There are " + count + " even numbers in your array.");
    }
}
