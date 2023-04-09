package com.java.class25;

public class Dog {
    String name;
    int age;
    char gender;

    //Constructor-
    //Rules for constructor:
    //1. The name of the Constructor should be same as class name
    //2. It must
    //
    //
    Dog(String nameFromUser, int ageFromUser){
        name = nameFromUser;
        age = ageFromUser;
    }

    void bark(){
        System.out.println(name + " is barking");
    }

    void play(){
        System.out.println(name + " is playing");
    }


}
