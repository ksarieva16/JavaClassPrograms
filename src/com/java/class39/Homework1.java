package com.java.class39;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter five numbers ");
        for (int i = 0; i < 5; i++){
            numbers.add(sc.nextInt());
        }

        //Sort the ata and print
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
    }
}
