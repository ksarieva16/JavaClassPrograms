package com.java.homework;

import java.util.Scanner;

//TODO: Homework 3:
//Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so “coding” yields “codign”.
//lastTwo(“coding”) → “codign”
//lastTwo(“cat”) → “cta”
//lastTwo(“ab”) → “ba”
public class homework12part3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your string: ");
    String str = input.nextLine();
    System.out.println(lastTwo(str));
    }

    public static String lastTwo(String str){
        return str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
    }
}
