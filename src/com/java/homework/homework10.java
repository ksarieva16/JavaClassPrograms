package com.java.homework;

import java.util.Scanner;

//TODO: 1.Create a method that takes a person's height as a double (in meters)
// and returns their height in feet and inches. Google the formula.
//2.Create a method that takes a char representing a grade (A, B, C, D, or F)
// and returns a boolean indicating whether the grade is passing or failing.
// A and B are passing, C,D,F are failing.
//3.Create a method that takes a boolean indicating whether someone is a member
// of a loyalty program and a double representing the cost of a purchase,
// and returns a double representing the final cost of the purchase after applying a discount.
// If the customer is a loyalty customer apply 10% discount.
public class homework10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height in meter: ");
        double height = input.nextDouble();
        System.out.println("Yor height in feet is: " + convertToFeet(height));
        System.out.println("Yor height in feet is: " + convertToInches(height));
    }

    public static double convertToFeet(double height){
        return height*3.281;
    }

    public static double convertToInches(double height){
        return height*39.37;
    }



}
