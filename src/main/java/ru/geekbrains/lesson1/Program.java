package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Product bottleOfWater1 = new BottleOfWater("Aura", "Негазированная", 1.04, 1.50);
        Product bottleOfWater2 = new BottleOfWater("Aura", "Негазированная", 1.04, 1.00);
        BottleOfWater bottleOfWater3 = new BottleOfWater("Aquale", "Газированная", 0.64, 0.50);
        Product bottleOfWater4 = new BottleOfWater("Bonaqua", "Газированная со вкусом малины", 55, 2);
//        System.out.println(bottleOfWater1.displayInfo());
        Product bottleOfMilk1 = new BottleOfMilk("Милкавита", "Ультрапастеризованное", 1.99, 1.0, 2.50);
//        System.out.println(bottleOfMilk1.displayInfo());
        Product chips1 = new Chips("Lay's", "Соус манго-чили", 3.79, 125.00, 520.00);
        Product chips2 = new Chips("Бульба Chips", "Перец с солью", 2.99, 150.00, 520.00);
        Product chocolate1 = new Chocolate("Michelle", "Горький с трюфельной начинкой", 1.74, 90.00, 550);
        Product chocolate2 = new Chocolate("Ritter Sport", "Тёмный с марципановой начинкой", 6.30, 100.00, 493);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater4);
        products.add(bottleOfWater3);
        products.add(chips1);
        products.add(chips2);
        products.add(chocolate1);
        products.add(chocolate2);

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(1);
        if (bottleOfWaterResult != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterResult.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

        Chocolate chocolateResult = vendingMachine.getChocolate(550);
        if (chocolateResult != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolateResult.displayInfo());
        }
        else {
            System.out.println("Такого шоколада нет в автомате.");
        }

        Chips chipsResult = vendingMachine.getChips(150);
        if (chipsResult != null){
            System.out.println("Вы купили: ");
            System.out.println(chipsResult.displayInfo());
        }
        else {
            System.out.println("Таких чипсов нет в автомате.");
        }
    }
}
