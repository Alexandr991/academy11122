package by.academy.lesson4;

import java.util.Random;
import java.util.Arrays;

/*
 * Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
 * Определите какой элемент является в этом массиве максимальным и
 * сообщите индекс его последнего вхождения в массив.
 */
public class ArrayTask8 {
    public static void main(String[] arg) {
        int[] myArray = new int[12];
        Random rand = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt(30) - 15;
        }
        System.out.println(Arrays.toString(myArray));
        int minValue = myArray[0];
        int minIndex = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] <= minValue) {
                minValue = myArray[i];
                minIndex = i;
            }
        }
        System.out.println("Min value in array: " + minValue);
        System.out.println("Min value index: " + minIndex);

    }
}
