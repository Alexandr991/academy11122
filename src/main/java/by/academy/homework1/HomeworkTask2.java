package by.academy.homework1;

import java.util.Scanner;

public class HomeworkTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter data Type:");
        String dataType = scan.next();
        dataType = dataType.toLowerCase();
        switch (dataType) {
            case "int":
                System.out.println("Enter number:");
                if (scan.hasNextInt()) {
                    int number = scan.nextInt();
                    System.out.println("Your string type is :" + dataType + " = " + number % 2);
                } else {
                    System.out.println("You entered not a number!");
                }
                break;
            case "double":
                System.out.println("Enter number:");
                if (scan.hasNextDouble()) {
                    double number = scan.nextDouble();
                    System.out.println("Your string type is :" + dataType + " = " + number * 0.7);
                } else {
                    System.out.println("You entered not a number!");
                }
                break;
            case "float":
                System.out.println("Enter number:");
                if (scan.hasNextFloat()) {
                    float number = scan.nextFloat();
                    System.out.println("Your string type is :" + dataType + " = " + number * number);
                } else {
                    System.out.println("You entered not a number!");
                }
                break;
            case "char":
                System.out.println("Enter your char:");
                if (scan.hasNext()) {
                    String firstchar = scan.next();
                    System.out.println("Your string type is :" + dataType + " = " + "'" + firstchar.charAt(0)
                            + "'" + '\n' + "Unicode number is:" + firstchar.codePointAt(0));
                } else {
                    System.out.println("You entered not a char!");
                }
                break;
            case "string":
                System.out.println("Enter your string:");
                if (scan.hasNext()) {
                    String yourString = scan.next();
                    System.out.println("Your string type is :" + dataType + " = " + "Hello " + yourString);
                } else {
                    System.out.println("You entered not a string!");
                }
                break;
            default:
                System.out.println("Unsupported type.");
                break;
        }
        scan.close();

    }

}
