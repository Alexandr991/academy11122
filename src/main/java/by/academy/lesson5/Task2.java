package by.academy.lesson5;

public class Task2 {
    public static void main(String[] arg) {
        int number1 = 3;
        int number2 = 56;
        StringBuilder sb = new StringBuilder();
        sb.append(number1);
        sb.append(" + ");
        sb.append(number2);
        sb.append(" = ");
        System.out.println(sb.append(number1 + number2));

        sb = new StringBuilder();
        sb.append(number1);
        sb.append(" - ");
        sb.append(number2);
        sb.append(" = ");
        System.out.println(sb.append(number1 - number2));

        sb = new StringBuilder();
        sb.append(number1);
        sb.append(" * ");
        sb.append(number2);
        sb.append(" = ");
        System.out.println(sb.append(number1 * number2));
        int equally = sb.indexOf("=");
        sb.deleteCharAt(equally);
        System.out.println(sb.insert(equally, "равно"));
        int multiplication = sb.indexOf("*");
        System.out.println(sb.replace(multiplication, multiplication + 1, "умножить"));

    }
}
