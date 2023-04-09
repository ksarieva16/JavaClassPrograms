package com.java.class16;

public class WhileLoop2 {
    public static void main(String[] args) {
        //Write a program that will print out
        String str ="*";
        System.out.println("Task1");
        while (str.length() < 6){
            System.out.println(str);
            str = str + "*";
        }

        //write a program that prints out

        System.out.println("Task2");
        int number = 10;
        while (number >= 0) {
            System.out.println(number);
            number--;
        }

        System.out.println("Task3");
        String s = "*****";
        while (s.length() > 0) {
            System.out.println(s);
            s = s.substring(0,s.length()-1);
        }

        //write a program that will
        //print out even numbers until 20
        //четные

        int num1 = 0;
        while (num1<=20){
            num1+=2;
            System.out.println(num1);
        }


        //Write a program
        //that will count number of vowel characters and
        //and consonant characters in a String

        //String str = "Hello DevXer";
        //4 - vowels
        //8 - consonants including the space

        System.out.println("Task5");


    }
}
