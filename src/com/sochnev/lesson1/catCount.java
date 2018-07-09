package com.sochnev.lesson1;

public class catCount {
    public static void main(String[] args) {

        Cat[] cat = new Cat[10];

        for (int i=0; i<10; i++){
          cat[i] = new Cat();
            System.out.println(cat[i].toString());
        } //создай 10 котов

        System.out.println (Cat.catCount); //выведи значение переменной catCount
    }

    public static class Cat {
        public static int catCount=0;

        public Cat(){
            catCount++;
        }

    }
}