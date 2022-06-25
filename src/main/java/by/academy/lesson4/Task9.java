package by.academy.lesson4;

/*
 * Даны натуральные числа от 35 до 87. Найти и напечатать те из них,
 * которые при делении на 7 дают остаток 1, 2 или 5.
 */
public class Task9 {
    public static void main(String[] arg) {
        for (int a = 35; a <= 87; a++) {
            if (a % 7 == 1 || a % 7 == 2 || a % 7 == 5) {
                System.out.print(a + " ");
            }
        }
    }
}
