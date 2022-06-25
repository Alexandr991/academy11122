package by.academy.lesson4;

/*
 * Создайте массив из всех нечётных чисел от 1 до 99,
 * выведите его на экран в строку, а затем этот же массив
 * выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
 */
public class ArrayTask2 {
    public static void main(String[] arg) {
        int a = 1;
        int myArrayLength = 0;
        while (a < 100) {
            a += 2;
            myArrayLength++;
        }
        int[] myArray = new int[myArrayLength];
        a = 1;
        for (int i = 0; i < myArrayLength; i++) {
            myArray[i] = a;
            a += 2;
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        for (int i = myArrayLength - 1; i >= 0; i--) {

            System.out.print(myArray[i] + " ");
        }
    }
}
