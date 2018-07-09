package com.sochnev.lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayList {

        private static List<String> strings;

        public static void main(String[] args) throws Exception {

            ArrayList<String> list = new ArrayList<String>();

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


            for (int i = 0; i <5 ; i++) {
                list.add(br.readLine());
            }
            int size = 0;


            Collections.sort(list);

            System.out.println(list.get(0));


        }
}


