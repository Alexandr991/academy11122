package by.academy.homework2;

import java.util.Scanner;

public class HomeworkTask2 {
    public static void main(String[] arg) {
        int wordsCounter = 0;
        int minAmount = 0;
        int wordNumber = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many words do wont to check?");
        int numWords = scan.nextInt();
        do {
            wordsCounter++;
            System.out.println("Enter next word.");
            String str1 = scan.next();
            char[] arr = str1.toCharArray();
            StringBuilder sb = new StringBuilder();
            boolean repeateChar;
            int curentLength = sb.length();
            for (int i = 0; i < str1.length(); i++) {
                repeateChar = false;
                for (int j = i + 1; j < str1.length(); j++) {
                    if (arr[i] == arr[j]) {
                        repeateChar = true;
                        break;
                    }
                }
                if (!repeateChar) {
                    sb.append(arr[i]);
                }
                curentLength = sb.length();
            }
            if (minAmount == 0 || curentLength < minAmount) {
                minAmount = curentLength;
                wordNumber = wordsCounter;
            }
        }
        while (wordsCounter < numWords);
        System.out.println("Minimum number of different characters in word is: " + minAmount);
        System.out.println("Number of String is: " + wordNumber);
        scan.close();
    }

}






