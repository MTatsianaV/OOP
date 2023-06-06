package ru.geekbrains.lesson1;

public class Chocolate extends Product {

    private double weight; // вес
    private double calories; // каллорийность

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public Chocolate(String brand, String name, double price, double weight, double calories) {
        super(brand, name, price);
        this.weight = weight;
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколад:] %s - %s - %f - [вес: %f; каллорийность: %d]", brand, name, price, weight,
                calories);
    }
}