package by.academy.lesson4;

/*
 * Даны натуральные числа от 1 до 50. Найти сумму тех из них, которые делятся на 5 или на 7.
 */
public class Task10 {
    public static void main(String[] arg) {
        int sum = 0;
        for (int a = 1; a <= 50; a++) {
            if (a % 5 == 0 || a % 7 == 0) {
                sum += a;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
