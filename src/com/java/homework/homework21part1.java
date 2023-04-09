package com.java.homework;

//1. Write a program to get two 2D arrays from the user and print the sum of it
public class homework21part1 {
    public static void main(String[] args) {

        int[][] array1 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] array2 = {{4, 4, 4}, {2, 2, 2}, {1, 1, 1}};
        int[][] sum = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = array1[i][j] + array2[i][j];
                System.out.print(sum[i][j]);
            }
            System.out.println();
        }
    }
}
