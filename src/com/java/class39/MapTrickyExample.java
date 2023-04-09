package com.java.class39;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class MapTrickyExample {
    public static void main(String[] args) {
        List<String> ingredients = new ArrayList<>();
        Map<String, List<String>> foodIngredients = new HashMap<>();

        ingredients.add("Raw rice");
        ingredients.add("Water");
        ingredients.add("Air");

        foodIngredients.put("Boiler", ingredients);

        ingredients = new ArrayList<>();
        ingredients.clear();

        ingredients.add("vegetable");


    }
}
