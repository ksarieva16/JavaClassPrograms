package com.java.class38;

import java.util.ArrayList;
import java.util.List;

public class ListOfFruits {
    public static void main(String[] args) {
        // create a list of fruits
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("kiwi");
        fruits.add("orange");

        // check do we have banana
        if (fruits.contains("banana")) {
            // remove mango if banana exists
            fruits.remove("mango");
        }

        // print the list
        System.out.println(fruits);
    }
}