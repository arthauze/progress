package com.sochnev.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fightArray {
    public static void main(String[] args) throws Exception {

        int[] array = new int[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        int max = max(array);
        System.out.println(max);
    }


    public static int max(int[] array) {
        int odd = 0;
        int even = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {

            if (i%2 == 0)
            odd += array[i];
            else
            even +=array[i];

        }
        if (odd > even)
          max = odd;
        else
          max = even;

        return max;
    }
}

