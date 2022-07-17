package by.academy.lesson7;

import java.util.Objects;

public class Phone {
    private String number;
    private String model;
    private double weight;


    public Phone() {
        super();
    }

    public Phone(String number, String model) {
        this();
        this.number = number;
        this.model = model;

    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.weight, weight) == 0 &&
                Objects.equals(number, phone.number) && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, model, weight);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void receiveCall(String name) {
        System.out.println("Call:" + name + "\n" + "number:" + getNumber());
    }

    public void receiveCall(String name, String number) {
        System.out.println("Call:" + name + "\n" + "number:" + number);
    }

    public void sendMessage(String... array) {
        for (String str : array) {
            System.out.println(str);
        }
    }
}
