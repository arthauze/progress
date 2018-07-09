package com.sochnev.lesson1;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class array {

    /**
     * 1. В методе initializeArray():
     1.1. Создайте массив на 20 чисел
     1.2. Считайте с консоли 20 чисел и заполните ими массив
     2. Метод max(int[] array) должен находить максимальное число из элементов массива


     Требования:
     1. Метод initializeArray должен создавать массив из 20 целых чисел.
     2. Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
     3. Метод max должен возвращать максимальный элемент из переданного массива.
     4. Метод main изменять нельзя.
     */
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] array = new int[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        // создай и заполни массив
        return array;
    }

    public static int max(int[] array) {
        int maxValue = array[0];
        int arrayLength = array.length;
        for (int i = 1; i <= arrayLength - 1; i++) {
            int value = array[i];
            if (value > maxValue) {
                maxValue = value;// найди максимальное значение

            }
        }
        return maxValue;
    }
}
