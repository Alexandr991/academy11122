package by.academy.lesson4;

/*
 * Даны натуральные числа от 20 до 50.Напечатать те из них, которые делятся на 3, но не делятся на 5.
 */
public class Task8 {
    public static void main(String[] arg) {
        for (int a = 20; a <= 50; a++) {
            if (a % 3 == 0 && a % 5 != 0) {
                System.out.print(a + " ");
            }
        }
    }
}

