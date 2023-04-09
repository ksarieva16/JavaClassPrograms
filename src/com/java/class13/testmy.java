package com.java.class13;

public class testmy {
    public static void main(String[] args) {
        System.out.println(giveBool(5,18));
        System.out.println(giveBool(10,5));

    }
    public static boolean giveBool (int num1, int num2){
        return num1 >= 10 && num1 <= 20 || num2 >= 10 && num2 <= 20;
    }

}
