package by.academy.lesson5;

public class Task0 {
    public static void main(String[] arg) {
        String s = "To work with strings in Java, use the classes: string, stringBuilder, stringBuffer";
        System.out.println(s);
        System.out.println("indexof(s)" + s.indexOf('s'));
        System.out.println("indexof S,60 =" + s.indexOf('s', 60));
        // вывести все индексы "S"
        int index = -1;
        do {
            index = s.indexOf('s', index + 1);          // определяем все ндексы 's' (учитывается регистр!)
            if (index >= 0) {
                System.out.print(index + " ");
            }
        }
        while (index >= 0);

    }

}
