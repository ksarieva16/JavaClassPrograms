package com.java.homework;

import java.util.Scanner;

//TODO:Homework 2:
//Write a method that takes a string   returns a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
//extraEnd(“Hi”) → “HiHiHi”
//extraEnd(“Hello”) → “lololo”
//extraEnd(“ab”) → “ababab”
public class homework12part2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = input.nextLine();
        System.out.println(copyOfLast(str));
    }

    public static String copyOfLast(String str){
        String s = str.substring(str.length()-2);
        return s+s+s;
    }




}
