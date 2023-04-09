package com.java.class06;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter you age");
        int age = input.nextInt();
        String a = "It is my age: ";
        System.out.println(a + age);


        System.out.println("Please enter yyour credit score between 0-820");
        int creditScore = input.nextInt();
        String b = "It is my credit score: ";
        System.out.println(b + creditScore);

        //ask a user their marital status
        //married or single
        //true or false
        System.out.println("Please enter your marital status");
        boolean isMarried = input.nextBoolean();
        System.out.println("is married?" + isMarried);

        System.out.println("Please enter your marital status");
        boolean maritalStatus = input.nextBoolean();
        System.out.println("is married?" + maritalStatus);

        //input.next() -> takes only one word(the text until the first space)
        //input.nextLine() -> takes full line of text

        }


    }

