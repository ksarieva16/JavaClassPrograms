package com.java.class18;

import java.util.Scanner;

public class DoWhileLoop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Please enter your number: ");
            int num1 = sc.nextInt();
            System.out.println(num1*num1);
            System.out.println("Would you like to do more operations?(Yes / No)");
            choice = sc.next();
        }while(choice.equalsIgnoreCase("yes"));
    }
}
