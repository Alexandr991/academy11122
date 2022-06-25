package by.academy.lesson5;

public class Task3 {
    public static void main(String[] arg) {
        String str = "\" Object-oriented programming is a programming language model" +
                " organized around objects rather than \"actions\" and data rather than logic." +
                " Object-oriented programming blabla. Object-oriented programming bla. Object-oriented programming bla.\"";
        StringBuilder sr = new StringBuilder(str);
        String oop = "Object-oriented programming";
        int index = -1;
        int iteration = 1;
        do {
            index = sr.indexOf("Object-oriented programming", index + 1);
            if (iteration > 1 && index != -1) {
                sr.replace(index, index + oop.length(), "OOP");
            }
            iteration++;
        }
        while (index != -1);
        System.out.println(sr);
    }
}
