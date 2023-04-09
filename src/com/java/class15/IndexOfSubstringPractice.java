package com.java.class15;

public class IndexOfSubstringPractice {
    public static void main(String[] args) {
        String str = "I love wakin up at 5am";
        int indexOf5am = str.indexOf("5am");
        System.out.println(str.substring(indexOf5am));
    }
}
