package com.java.class24;

public class DisplayArrayInTableForm {
    public static void main(String[] args) {
        int data[][] = {
                {3, 5, 7},
                {5, 7, 2},
                {6, 3, 1}
        };

        for (int i=0;i<data.length;i++){
            for (int j=0;j<data[i].length;j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
