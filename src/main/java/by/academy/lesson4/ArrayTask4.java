package by.academy.lesson4;
/*
 * Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
 * Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
 */
import java.util.Random;
import java.util.Arrays;

public class ArrayTask4 {
    public static void main(String[] arg) {
        int[] myArray = new int[8];
        Random rand = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (rand.nextInt(10) + 1);
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println();
        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 != 0) {                                //проверка индекса на чётность
                myArray[i] = 0;
            }
        }
        System.out.print(Arrays.toString(myArray));
    }
}
