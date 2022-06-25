package by.academy.lesson4;

import java.util.Random;
import java.util.Arrays;

/*
 * Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
 * выведите массивы на экран в двух отдельных строках. Посчитайте среднее
 * арифметическое элементов каждого массива и сообщите,
 * для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
 */
public class ArrayTask5 {
    public static void main(String[] arg) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        double sumArray1 = 0;
        double sumArray2 = 0;
        Random arrayRandom = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = arrayRandom.nextInt(6);
            sumArray1 += array1[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println("The mean of array1: " + (sumArray1 / array1.length));
        for (int i = 0; i < array2.length; i++) {
            array2[i] = arrayRandom.nextInt(6);
            sumArray2 += array2[i];
        }
        System.out.println(Arrays.toString(array2));
        System.out.println("The mean of array2: " + (sumArray2 / array2.length));
        if (sumArray1 / array1.length > sumArray2 / array2.length) {
            System.out.println("The mean of array1 is larger.");
        } else if (sumArray1 / array1.length == sumArray2 / array2.length) {
            System.out.println("The mean of array1 is equals the mean of array2.");
        }
        else {
            System.out.println("The mean of array2 is larger.");
        }
    }
}
