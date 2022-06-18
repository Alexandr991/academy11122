package by.academy.lesson3;

public class Task4 {
    public static void main(String[] args) {
        int s = 234_370_000;
        int sec;
        int m;
        int min;
        int h;
        int day;
        int week;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        System.out.println(h + " часов " + min + " минут "
                + sec + " секунд");
        day = (h / 24);
        h %= 24;
        System.out.println(day + " Дней " + h + " часов " + min + " минут "
                + sec + " секунд");
        week = day / 7;
        day %= 7;
        System.out.println(week + " Недель " + day + " Дней " + h + " часов " + min + " минут "
                + sec + " секунд");


    }
}
