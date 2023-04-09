package com.java.homework;

import java.util.Scanner;

//TODO: Homework 1:
//Write a method that takes a string and returns true if the string starts with “hi” and false otherwise.
public class homework12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String str1 = input.nextLine();
        System.out.println(startHi(str1));

    }
    public static boolean startHi(String str1) {
        return str1.startsWith("hi");
    }
}
