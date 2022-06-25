package by.academy.lesson5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] arg) {
        String s = "I like Java!!!";
        char n = s.charAt(s.length() - 1);                       // определяем последний символ строки
        System.out.println("Last index is " + n);
        boolean endString;
        endString = s.endsWith("!!!");                           // проверяем заканчивается ли строка символами "!!!"
        System.out.println(endString);
        boolean startString;
        startString = s.startsWith("I like");                    // проверяем начинается ли строка символами I like"
        System.out.println(startString);
        boolean containString;
        containString = s.contains("Java");
        System.out.println(containString);
        int index = s.indexOf("Java");                           // находим индекс подстроки Java
        System.out.println(index);
        System.out.println(s.replace('a','o'));   // заменяем символы в строке
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(7,11));
    }
}
