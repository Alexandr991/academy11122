package by.academy.lesson1;

public class Main {
    public static class Man {
        int cars;
        String hair;

        public Man() {

        }
    }

    public static void main(String[] args) {
        Man man = new Man();
        man.cars = 2;
        man.hair = "black";

        System.out.println(man.hair + " " + man.cars);

    }

}

