package com.java.class14;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        String str3 = "Superstar";
        System.out.println(str3.charAt(5));

        //Error if string index is out of ange
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str4 = sc.nextLine();
        System.out.println(lastChar(str4));
    }

    public static char lastChar(String str4) {
        return str4.charAt(str4.length()-1);

    }



}
