package by.academy.lesson5;

import java.util.Formattable;
import java.util.Formatter;

public class Task5Formatter {
    public static void main(String[] args) {
        print("Ivanov", 5, "mathematics");
        print("Petrov", 4, "physics");
        print("Sidorov", 5, "geographic");
        print("Milevskiy", 10, "computer science");

    }

    private static void print(String name, int mark, String subject) {
        Formatter formatter = new Formatter();
        formatter.format("Student: %-15s mark: %-3s subject: %-10s", name, mark, subject);
        //%s -ожидается передача данных типа строка, 15 (кол-во символов), "-" выравнивание по левому краю.
        System.out.println(formatter);
        /*  System.out.printf("Student: %-15s mark: %-3s subject: %-10s \n", name, mark, subject);
        выполнает то же самое, что и весь метод выше. Добавляем перенос троки \n ( отсутствует в методе).
         */
    }
}
