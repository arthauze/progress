package com.sochnev.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Сортировка массива пузырьком
 */
public class Mimimum {

    public static void main(String[] args) throws IOException {

        int nums[] = new int[5];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input a number");
        for (int i = 0; i< nums.length; i++) {

        nums[i] = Integer.parseInt(br.readLine());
        }
/*

 */
        for (int i = nums.length-1; i >0; i--) {
            for (int j = 0; j < i; j++){
                if (nums[j] > nums[j+1]) {

                    int tmp = nums[j];
                    nums[j] = nums [j+1];
                    nums [j+1] = tmp;

                }
            }
        }


        for (int i=0; i <nums.length; i++){
            System.out.print(nums[i] + " ");
        }



    }
}
