package ru.geekbrains.lesson1;

public class Chips extends Product{

    private double weight; // вес
    private int calories; // каллорийность

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Chips(String brand, String name, double price, double weight, int calories) {
        super(brand, name, price);
        this.weight = weight;
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format("[Чипсы:] %s - %s - %f - [вес: %f; каллорийность: %d]", brand, name, price, weight, calories);
    }
}