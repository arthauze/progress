package com.sochnev.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class evenOdd {

    static int even;
    static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String number = br.readLine();
        int count = number.length();

        for (int i = 0; i < count; i++) {
            char tmp = number.charAt(i);
            int x = Character.getNumericValue(tmp);

            if (x != 0) {
                if (x % 2 == 0)
                    even++;
                else
                    odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}