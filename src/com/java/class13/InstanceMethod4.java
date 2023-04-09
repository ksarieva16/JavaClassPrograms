package com.java.class13;

import java.util.Scanner;

public class InstanceMethod4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the number1");
        int number1 = input.nextInt();

        System.out.println("Please, enter the number2");
        int number2 = input.nextInt();


        InstanceMethod4 var = new InstanceMethod4();
        System.out.println(var.myMethod(number1, number2));
    }

    public boolean myMethod(int number1, int number2) {
        return number1 == 10 || number2 == 10 || number1 + number2 == 10;
    }
}




