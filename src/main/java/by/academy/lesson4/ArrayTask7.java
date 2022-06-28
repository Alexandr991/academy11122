package by.academy.lesson4;
/*
 * Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
 * Напоминаем, что первый и второй члены последовательности равны единицам,
 * а каждый следующий — сумме двух предыдущих.
 */

import java.util.Arrays;

public class ArrayTask7 {
    public static void main(String[] arg) {
        int[] myArray = new int[20];
        int k = 1;
        int n = 0;
        for (int i = 1; i < myArray.length; i++) {
            myArray[0] = 1;
            myArray[i] = k + n;
            int m = n;
            n = k;
            k += m;


        }
        System.out.println(Arrays.toString(myArray));
    }
}
