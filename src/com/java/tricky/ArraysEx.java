package com.java.tricky;

public class ArraysEx {
    public static void main(String[] args) {
        int a[] = {0, 1, 2, 2, 0, 3};

        for (int i = 0; i < a.length; i++){
            a[i] = a[a[i] + 2] % a.length;
        }

        for (int i : a) {
            System.out.println(i);
        }
    }
}

//output:
//2
//2
//0
//0
//0
//3
