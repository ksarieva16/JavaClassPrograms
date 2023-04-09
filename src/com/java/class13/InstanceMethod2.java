package com.java.class13;

import java.util.Scanner;

public class InstanceMethod2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please, enter the number1");
    int number1 = input.nextInt();
    System.out.println("Please, enter the number2");
    int number2 = input.nextInt();

    InstanceMethod2 sameRemainder = new InstanceMethod2();
        System.out.println(sameRemainder.lastDigit(number1, number2));

    }

    public boolean lastDigit(int number1, int number2) {
        return (number1 % 10 == number2 % 10);
    }


}
