package com.java.class06;

//must have to be able to use Scanner
//import statement is a that tell our class to use functionality from different packages
import java.util.Scanner;

public class ScannerPractice {
    //compiling a code => checking if we are matching all syntax rules
    public static void main(String[] args) {
        //before you can use scanner you have to have import statement
        //before public class line
        Scanner input = new Scanner(System.in);

        //input.nextInt() -> will enable us to input and int data to our
        //program
        input.nextInt();
        input.nextLine();
        input.nextDouble();
        input.nextBoolean();

    }
}
