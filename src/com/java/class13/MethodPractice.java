package com.java.class13;

import java.util.Scanner;

public class MethodPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the number1");
        int number1 = sc.nextInt();
        System.out.println("Please, enter the number2");
        int number2 = sc.nextInt();


    }
    public static int sum( int number1, int number2) {

        if (number1 != number2){
            return (number1 + number2);
        }
        else {
            return (number1 + number2) * 2;
        }
    }

    public static boolean inTheRange(int number1, int number2) {
        return number1 >= 10 && number1 <= 20 || number2 >= 10 && number2 <= 20;
        }



        }


