package com.java.class18;

public class TaskForPractice {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 50) {
            if (i % 5 == 0 || i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
