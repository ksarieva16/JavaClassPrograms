package com.java.class15;

public class Trim {
    public static void main(String[] args) {
        String str = "Elon";
        boolean isequal = str.equals("Elon");
        System.out.println(isequal);

        String answer = "yes ";
        boolean yesOrNo = answer.equalsIgnoreCase("yes");
        System.out.println(yesOrNo);

        System.out.println(answer.trim()); //return yes without this space


    }
}
