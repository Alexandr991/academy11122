package by.academy.lesson5;

public class Task4 {
    public static void main(String[] arg) {
        String str1 = "string";
        String str2 = "code";
        String str3 = "Practice";
        StringBuilder str = new StringBuilder(str1);
        int middle1 = str1.length() / 2;
        System.out.println(str.substring(middle1 - 1, middle1 + 1));    //выводим в консоль два средних символа строки
        str = new StringBuilder(str2);
        int middle2 = str2.length() / 2;
        System.out.println(str.substring(middle2 - 1, middle2 + 1));
        str = new StringBuilder(str3);
        int middle3 = str3.length() / 2;
        System.out.println(str.substring(middle3 - 1, middle3 + 1));

    }
}
