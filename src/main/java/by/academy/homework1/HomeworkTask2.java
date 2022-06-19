package by.academy.homework1;

import java.util.Scanner;

public class HomeworkTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter data Type:");
        String dataType = scan.next();
        System.out.println("Enter number:");
        int number = scan.nextInt();
        dataType = dataType.toLowerCase();
        switch (dataType) {
            case "int":
                System.out.println("Your string is :" + dataType + " = " + number % 2);
                break;
            case "double":
                System.out.println("You string is :" + dataType + " = " + number * 0.7);
                break;
            case "float":
                System.out.println("You string is :" + dataType + " = " + number * number);
                break;
            case "char":
                String str = Integer.toString(number);
                System.out.println("Your string is :" + dataType + " = " + str.charAt(0));
                break;
            case "string":
                str = Integer.toString(number);
                System.out.println("Your string is :" + dataType + " = " + "Hello " + str);
                break;
            default:
                System.out.println("Unsupported type.");
                break;
        }
        scan.close();

    }

}
