package com.java.class13;

import java.util.Scanner;

public class InstanceMethod3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the number");
        int number = input.nextInt();


        InstanceMethod3 var = new InstanceMethod3();
        System.out.println(var.isMultipleNumber(number));


    }
    public boolean isMultipleNumber(int number) {
        return (number % 3 == 0 && number % 5 == 0 );
    }


}
