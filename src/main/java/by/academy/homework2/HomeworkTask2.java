package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkTask2 {
    public static void main(String[] arg) {
        int count = 0;
        int wordsCounter = 0;
        int min;
        int minZnac = 0;
        int word = 0;
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many words do wont to check?");
        int numWords = scan.nextInt();
        do {
            count=0;
            System.out.println("Enter next word.");
            String str1 = scan.next();
            System.out.println(str1.toCharArray());
            min = str1.length();
            for (int i = 0; i < str1.length(); i++) {
                int unic = str1.charAt(i);
                if (str1.indexOf(unic)==str1.lastIndexOf(unic)){
                    count++;
                }

//                for (int j = 0; j < str1.length(); j++) {
//                    count = 0;
//                    if (str1.charAt(i) == str1.charAt(j)) {
//                        count = 1;
//                        break;
//                    }
//                }
//                if (count==0){
//                    counter++;
//                }
            }
            if(count<min){
                min =count;  // кол-во уникальных символов
            }

//            minZnac = counter;
            wordsCounter++;      // номер слова в котором мин уникальных символов


        }
        while (wordsCounter < numWords);
        System.out.println(min);
 //       System.out.println(minZnac);
        System.out.println(wordsCounter);


//
//        while (scan.hasNext()) {
//            for (int i = 0; i < str1.length(); i++) {
//                for (int j = 0; j < str1.length(); j++) {
//                    if (i == j + 1) {
//                        count = str1.length() - 1;
//
//                    }
//                }
//
//            }
//            System.out.println(count);


//        String[] myArray = new String[];
//        myArray = str1.split(" ");
//        System.out.println(Arrays.toString(myArray));
//        for (int i = 0; i < myArray.length; i++) {
//            for (i = 0; i < myArray.length; i++) {

    }
}



