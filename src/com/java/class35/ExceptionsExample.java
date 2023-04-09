package com.java.class35;

public class ExceptionsExample {
    public static void main(String[] args) {
        int[] listOfNumbers = {1, 2, 3, 4};
        String myStr = null;

        try {
            System.out.println(listOfNumbers[5]);
            System.out.println(myStr.length());
        } catch (Exception e){
            System.out.println("Something wrong");
        }
    }
}
