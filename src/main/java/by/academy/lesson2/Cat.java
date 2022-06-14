package by.academy.lesson2;

public class Cat {
    int age;
    String nickname;
    int money;
    char initials;
    boolean isHomeAnimal;

    public void grow() {
        age++;
    }

    public void sleep() {
        System.out.println("Кот спит");
    }

    public void eat() {
        System.out.println("Кот ест");
    }

    public void walk() {
        System.out.println(nickname + " гуляет");
    }

    public Cat() {

    }

    public Cat(String nickname) {
        this.nickname = nickname;
        this.initials = this.nickname.charAt(0); // string.charAt(0)  извлекаем первый символ строки
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;


    }

    public char getInitials() {
        return initials;
    }

    public boolean isHomeAnimal() {
        return isHomeAnimal;
    }

    public void setHomeAnimal(boolean homeAnimal) {
        isHomeAnimal = homeAnimal;
    }
}




