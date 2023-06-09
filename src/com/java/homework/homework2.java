package com.java.homework;

public class homework2 {
    public static void main(String[] args){

        ///
        //1. Arithmetic Operators
        //Find the output of the below expressions
        System.out.println("Arithmetical Operators \n ");
        System.out.println(14 % 5); // 4
        System.out.println(21 % 6); // 3
        System.out.println(73 % 2); // 1
        System.out.println(40 % 7); // 5
        System.out.println(16 % 1); // 0
        System.out.println(80 % 8); // 0
        System.out.println(92 % 9); // 2
        System.out.println(77 % 5); // 2

        ///
        //2. Expression Priority and Associativity
        //Find the output of the below expressions
        System.out.println("Expression Priority and Associativity \n ");

        System.out.println(12 + 8 / 3 + 4 / 2 - 3); // 13
        System.out.println(16 * 10 / (1 + 4) / 2 * 3); // 48
        System.out.println(2 * 4 * (3 + 4) / (2 * 3)); // 9
        System.out.println(5 * 2 / 10 + 6 / 6 * 6 ); // 7

        ///
        //3. Relational Operator
        //Find the output of the below expressions
        System.out.println("Relational operators \n ");

        int a = 1, b = -1;
        System.out.println(a > b); // true
        System.out.println(a < b); // false
        System.out.println(a >= b); // true
        System.out.println(a <= b); // false
        System.out.println(a != b); // true
        System.out.println(a == b); // false
    }
}
