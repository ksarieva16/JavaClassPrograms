package com.java.class14;

public class StringPractice2 {
    public static void main(String[] args) {
        //we have two ways of concatenating Strings
        //one via + sign
        String str = "<html>";
        str+="<body>";
        str+="<h1> Hello Devx </h1>";
        str+="</body>";
        str+="</html>";



        String str1 = "public class Hello";
        //concat method
        str1 = str1.concat("{");

        //   \n - > creates new Line
        //   \t - > creates a tab
        //   \" - > add " as a String
        //  \\ -> add as a String

        str1 = str1.concat("\n{");
        System.out.println(str);

        String str5 = "I";
        str5.concat("java");
        str5 = str5.concat(" love");
        System.out.println(str5);

        //

    }
}
