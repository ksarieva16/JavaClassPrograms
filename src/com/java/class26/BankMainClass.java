package com.java.class26;

public class BankMainClass {
    public static void main(String[] args) {
        Bank acc1 = new Bank();
        acc1.initData("Kera", "12345");
        acc1.deposit(1000);
    }
}
