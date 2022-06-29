package by.academy.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static void main(String[]arg){
        System.out.println(test("google.com"));
        System.out.println(test("reference1.by"));
        System.out.println(test ("reference8.org"));


    }
    public static boolean test(String testString){
        Pattern pattern = Pattern.compile("[a-z]+[0-5]{1}\\.(com|ua|ru|org|by)");
        Matcher matcher = pattern.matcher(testString);
        return matcher.matches();
    }
}
