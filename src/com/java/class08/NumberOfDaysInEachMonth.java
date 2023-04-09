package com.java.class08;

import java.util.Scanner;

public class NumberOfDaysInEachMonth {
    // write a program to take a month number from the user
    //and print the number of days in a give month

    //if user enter a number outside 1 and 12 print
    //out wrong entry. You can only input a number between 1 and 12. Please try again!

    //ex.
    //please enter the month in number

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the month in number: ");
        int monthNumber = input.nextInt();

        if (monthNumber == 1) {
            System.out.println("January has 31 days");
        }
        else if (monthNumber == 2) {
            System.out.println("February has 28 days");
        }
        else if (monthNumber == 3) {
            System.out.println("March has 31 days");
        }
        else if (monthNumber == 4) {
            System.out.println("April has 30 days");
        }
        else if (monthNumber == 5) {
            System.out.println("May has 31 days");
        }
        else if (monthNumber == 6) {
            System.out.println("June has 30 days");
        }
        else if (monthNumber == 7) {
            System.out.println("July has 31 days");
        }
        else if (monthNumber == 8) {
            System.out.println("August has 31 days");
        }
        else if (monthNumber == 9) {
            System.out.println("September has 30 days");
        }
        else if (monthNumber == 10) {
            System.out.println("October has 31 days");
        }
        else if (monthNumber == 11) {
            System.out.println("November has 30 days");
        }
        else if (monthNumber == 12) {
            System.out.println("December has 31 days");
        }
        else {
            System.out.println("Wrong Entry only numbers 1-12 are allowed.");
        }









    }
}
