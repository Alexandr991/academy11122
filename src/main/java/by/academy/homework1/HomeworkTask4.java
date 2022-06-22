package by.academy.homework1;

public class HomeworkTask4 {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 1; x < 1_000_000; i++) {
            x *= 2;
            if (x < 1_000_000) {
                System.out.println("2 ^ " + i + " = " + x);
            }
        }
    }
}
