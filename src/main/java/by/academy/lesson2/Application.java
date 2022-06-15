package by.academy.lesson2;

public class Application {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Dog");
        cat2.eat();
        cat2.sleep();
        cat2.walk();
        cat1.grow();
        cat1.grow();
        cat1.grow();
        System.out.println("Возраст кота без имени:" + cat1.age);
        Cat money = new Cat();
        money.setMoney(1234);
        System.out.println("Сумма: " + money.getMoney());
        System.out.println("Первая буква имени кота: " + cat2.getInitials());
        cat1.setHomeAnimal(true);
        System.out.println("Кот домашний: " + cat1.isHomeAnimal);


    }
}
