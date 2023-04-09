package com.java.class21;

import java.util.Scanner;

//5.  Write a program to print the reverse of the given number
//Example1
//Input - 86545
//Output - 54568
//Example2
//Input - 23561
//Output - 16532
public class Homework5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int rev = 0;

        while(num > 0) {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println(rev);
    }
}
