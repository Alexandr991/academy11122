package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkTask4 {
    public static void main(String[] arg) {
        int numberOfPlayers;
        int cardsPerPlayer = 5;
        String[] cards = {"2 Треф", "3 Треф", "4 Треф", "5 Треф", "6 Треф",
                "7 Треф", "8 Треф", "9 Треф", "10 Треф", "Валет Треф", "Дама Треф",
                "Король Треф", "Туз Треф", "2 Черв", "3 Черв", "4 Черв", "5 Черв",
                "6 Черв", "7 Черв", "8 Черв", "9 Черв", "10 Черв", "Валет Черв",
                "Дама Черв", "Король Черв", "Туз Черв", "2 Пик", "3 Пик", "4 Пик",
                "5 Пик", "6 Пик", "7 Пик", "8 Пик", "9 Пик", "10 Пик", "Валет Пик",
                "Дама Пик", "Король Пик", "Туз Пик", "2 Бубен", "3 Бубен",
                "4 Бубен", "5 Бубен", "6 Бубен", "7 Бубен", "8 Бубен", "9 Бубен",
                "10 Бубен", "Валет Бубен", "Дама Бубен", "Король Бубен", "Туз Бубен"};
        Scanner scan = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Enter number of players:");
            if (scan.hasNextInt()) {
                numberOfPlayers = scan.nextInt();
                if (numberOfPlayers <= 0) {
                    System.out.println(" The game needs people!");
                    continue;
                }
                if (numberOfPlayers > 5) {
                    System.out.println("There are too many people!");

                } else {
                    System.out.println("Let's start");
                    break;
                }
                System.out.println(numberOfPlayers);

            }
        }
        String[] cardsForPlayer = new String[numberOfPlayers * cardsPerPlayer];

        for (int i = 0; i < cardsPerPlayer * numberOfPlayers; i++) {
            int firstPlayer = (int) Math.floor(Math.random() * cards.length);
            cardsForPlayer[i] = cards[firstPlayer];


        }

        System.out.println(Arrays.toString(cardsForPlayer));
    }
}
