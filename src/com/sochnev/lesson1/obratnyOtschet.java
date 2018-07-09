package com.sochnev.lesson1;

public class obratnyOtschet {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);

            Thread.sleep(100);//напишите тут ваш код
        }

        System.out.println("Бум!");
    }
}
