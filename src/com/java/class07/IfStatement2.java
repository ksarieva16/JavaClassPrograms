package com.java.class07;

import java.util.Scanner;

public class IfStatement2 {

    public static void main(String[] args) {

        //take age from user
        Scanner input = new Scanner(System.in);
        //write a program that tells me if I am eligible to drive
        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        //print out you are eligible to drive for people older than 16

        if (age > 16) {
            System.out.println("You are Eligible to Drive");
        }
        if (age <= 16) {
            System.out.println("You are NOT Eligible to Drive");
        }

        System.out.println("---Weather---");

        //write a program that asks the user for weather in Fahrenheit
        //if the weather is less than 32F than print out it's Freezing. Stay Home
        //if the weather is more or equal to 32 and less than 41 than print out -> it's little chilly outside
        //if weather is more than or equal to 42 and less 68 ->
        //if weather is more than or equal to 68 -> its amazing outside

        System.out.println("Enter the gradus: ");
        int gradus = input.nextInt();
        if (gradus < 32) {
            System.out.println("It's freezing. Stay at home");
        }

        if (gradus >= 32 && gradus < 41) {
            System.out.println("It's little chilly outside!");
        }

        if (gradus >= 42 && gradus < 68) {
            System.out.println("It's a good weather outside. Go get some Fresh air");
        }

        if (gradus >= 68 ) {
            System.out.println("It's amazing outside! Let's go to pool and get vitamin D.");
        }


    }

}
