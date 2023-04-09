package com.java.homework;


import java.util.Arrays;

public class homework21 {
    public static void main(String[] args) {
        System.out.println("-----Task2-----");
        //Write a program to find the sum of array elements using for-each loop
        //Input: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        //Output: 55

        int[] listOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int i:listOfNumbers){
            sum+=i;
        }
        System.out.println("Sum: "+sum);




        System.out.println("-----Task3-----");
        //Program to print the sum of the smallest and greatest number from the array using for-each loop
        //Input: 45, 65, 85, 24, 45, 85, 34, 65, 100
        //Output: 124 (100 + 24)

        int[] listOfNumbers2 = {45, 65, 85, 24, 45, 85, 34, 65, 100};
        int min = listOfNumbers2[0];
        int max = 0;

        for (int i:listOfNumbers2){
            if(i>max){
                max=i;
            }else if (i<min){
                min=i;
            }
        }
        System.out.println("Sum of max and min number: " + (max+min));


        System.out.println("-----Task4-----");
        //Write a program to sort array elements in ascending order using for-each loop
        //Input: 5 2 8 7 1
        //Output: 1 2 5 7 8
        int[] nums = {5, 2, 8, 7, 1};
        Arrays.sort(nums);
        for (int i:nums){
            System.out.print(i+" ");
        }















    }
}

