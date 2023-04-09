package com.java.class26;

public class Bank {

    double balance;
    String accName;
    String accNumber;

    void initData(String accNameFromUser, String accNumberFromUser){
        balance = 0;
        accName = accNameFromUser;
        accNumber = accNumberFromUser;
    }

    void deposit(int amount){
        System.out.println(accName + " is trying to deposit " + amount + " into " + accNumber);
        balance = balance + amount;
    }

    void withdraw(int amount){
        System.out.println(accName + " is trying to deposit " + amount + " from " + accNumber);
        balance=balance-amount;
    }
}
