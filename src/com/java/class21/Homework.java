package com.java.class21;

import java.util.Scanner;

//3. Write a program to print the sum of each digit from the given number
//Example1
//Input - 3521
//Output - 11
//Example2
//Input - 5390
//Output - 17
public class Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;

        while(num > 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
