package by.academy.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main (String[] arg) {
        Pattern pattern = Pattern.compile("c*a*b\\s+[fhg]*");
        Matcher matcher = pattern.matcher("cccab fhgfhgfh");
        boolean b  = matcher.matches();
        System.out.println(b);

    }
}
