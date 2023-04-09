package com.java.class18;

public class WhileLoopExample {
    public static void main(String[] args) {

        int i = 1;

        while(i<=5){
            //System.out.println(i); //принт 1-5
            i++; //если условие правдиво, то добавляется один и выводится в консоли и так происходит от 2 до 6.
            System.out.println(i);
            //пока i = 1 цикл будет повторятся бесконечно
        }
//        System.out.println(i); // если мы вытащим принт за керли брекетс, то ответ будет 6. ай будет меняться внутри и будет выведен в консоли только итог
    }
}
