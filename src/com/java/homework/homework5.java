package com.java.homework;

import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {

        //TODO: 1. Ask the user how many Java exercises are you solving per day?
        //if it's less than 3 -> print out -> You are too lazy!
        //if it's more than or equal 3 and less than 5-> good job, but you should do better!
        //if it's more than or equal 5 than print out -> great job! You are on the right track!

        Scanner sc = new Scanner(System.in);

        System.out.println("----Task 1----");
        System.out.println("How many Java exercises are you solving per day? ");
        byte exercises = sc.nextByte();
        if (exercises < 3) {
            System.out.println("You are so lazy!");
        }

        if (exercises <= 3 && exercises < 5) {
            System.out.println("Good job! But you should do better");
        }

        if (exercises >= 5) {
            System.out.println("Great job! You are on the right track");
        }



        System.out.println("----Task 2----");
        //TODO: 2. Write a Java program that takes three positive integer numbers from the
        //user as input to calculate and output the average of those three numbers.


        System.out.println("Enter input 1: ");
        int number1 = sc.nextInt();
        System.out.println("Enter input 2: ");
        int number2 = sc.nextInt();
        System.out.println("Enter input 3: ");
        int number3 = sc.nextInt();

        if (number1 > 0 && number2 > 0 && number3 > 0) {
            System.out.println("Output: " + (number1 + number2 + number3) / 3);
        }



        System.out.println("----Task 3----");

        //TODO: Write a program to print a welcome message to the passenger and
        //notify them to do security checks if they are not coming from connecting flight,
        // and at the end print "enjoy your flight"


                //! - negating sign only works with booleans
                //it's very useful in if statments
                //where you want to execute the logic only when
                //condition is negative
                System.out.println(!true);


                boolean doesHaveDriveLicense = false;

                if (!doesHaveDriveLicense) {
                    System.out.println("Give ticket");
                }

            }
        }
