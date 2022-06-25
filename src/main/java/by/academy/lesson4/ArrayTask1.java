package by.academy.lesson4;
/*
 * Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
 * отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
 * Перед созданием массива подумайте, какого он будет размера.
 */

public class ArrayTask1 {
    public static void main(String[] arg) {
        int a = 2;
        int arrayL = 0;
        while (a <= 20) {
            a = a + 2;
            arrayL++;
        }
        int[] myArray = new int[arrayL];
        a = 2;
        for (int i = 0; i <= arrayL - 1; i++) {
            myArray[i] = a;
            a += 2;
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i <= arrayL - 1; i++) {

            System.out.println(myArray[i] + " ");
        }
    }
}
