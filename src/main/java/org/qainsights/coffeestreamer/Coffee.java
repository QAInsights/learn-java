package org.qainsights.coffeestreamer;

import java.util.HashMap;
import java.util.Map;

public class Coffee {
    private String name;
    private int caffineWeight;

    public Coffee(String name, int caffineWeight) {
        this.name = name;
        this.caffineWeight = caffineWeight;
    }

    public Coffee() {
        System.out.println("Constructing... Coffee...");

    }

    public String getCoffeeName() {
        return this.name;
    }

    public int getCaffineWeight() {
        return this.caffineWeight;
    }

    public static Map<String, Integer> getCoffeeWithCaffine() {

        Map<String, Integer> coffee = new HashMap<>();
        coffee.put("Americano", 5);
        coffee.put("Veranda", 12);
        coffee.put("Espresson", 17);
        coffee.put("Double Espresson", 24);
        coffee.put("Cappucinno", 14);
        coffee.put("Ice Coffee", 11);

        return coffee;


    }
}
