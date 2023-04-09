package com.java.homework;

import java.util.Scanner;
//Create a class & take two integer values from the user
public class ExceptionHandlingHW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();


        //Perform division operation & handle the appropriate Exception
        try {
            int result = num1 / num2;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }



        //Create a String variable with a null value
        String str = null;
        //Find the length of the null variable and handle the appropriate Exception
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("The string is null.");
        }

        //Create an array of five integers
        int[] arr = { 1, 2, 3, 4, 5};
        //Access the element at the fifth position
        //Handle the appropriate Exception
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index 5 is out of bounds");
        }
    }
}
