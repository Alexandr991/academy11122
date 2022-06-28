package by.academy.lesson4;
/*
 * Создайте массив из 4 случайных целых чисел из отрезка [10;99],
 * выведите его на экран в строку.
 * Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */

import java.util.Arrays;
import java.util.Random;

public class ArrayTask6 {
    public static void main(String[] arg) {
        int[] array1 = new int[4];
        int[] array2 = new int[4];
        Random rand = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rand.nextInt(89) + 10;
        }
        System.out.println("Array 1 : " + Arrays.toString(array1));
        int min = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] >= min) {
                min = array1[i];
            } else {
                System.out.println("Array is not sorted.");
                break;
            }
            if (min == array1[array1.length - 1]) {
                System.out.println("Array sorted.");
            }
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 90 + 10);
            //(приводим к целому числу)(Math.random()* (верхняя граница - нижняя граница(если включить верхнюю, то +1))+
            // нижняя граница
        }
        System.out.println("Array 2: " + Arrays.toString(array2));
        min = array2[0];
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] >= min) {
                min = array2[i];
            } else {
                System.out.println("Array is not sorted.");
                break;
            }
            if (min == array2[array2.length - 1]) {
                System.out.println("Array sorted.");
            }
        }
    }

}

