package com.java.class22;

import java.util.Arrays;
//Массивы
public class ArraysExample2 {
    public static void main(String[] args) {
        // Create and initialize an array
        int listOfData[] = {10, 30, 50, 30, 70, 40, 45, 32};
        int sum = 0;

         for (int i = 0; i < listOfData.length; i++){
             sum = sum + listOfData[i];
         }

        System.out.println(sum);

    }
}