package com.java.class07;

public class IfStatement {
    public static void main(String[] args) {

        if (true) {
            System.out.println("Hello world");
            System.out.println("Hello Jupiter");
        }
        //proceed with a normal execution
        System.out.println("I am outside of If statement");

        //when you have only one statement inside if statement
        //you can skip {}

        if (true)
            System.out.println("hello mars");
        System.out.println("Hello saturn"); // this line is in fact outside of the if statement scope
        // it will print in any codition


        System.out.println("---Task---");

        //I want to print out hello Venus only if my gallonOfOil is more than 1000;

        int gallonOgOil = 400;
        if(gallonOgOil>1000) {
            System.out.println("Hello Venus");
        }







    }
}
