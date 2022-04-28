package com.hackerrank.java.tests;

import java.util.*;

public class Java_Hashset {

    public static void main(String[] args) {
        String sample = "5\n" + "john tom\n" + "john mary\n" + "john tom\n" + "mary anna\n" + "mary anna";

        Scanner s = new Scanner(sample);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> pairs = new HashSet<>();

        for (int i = 0; i < t; i++) {
            pairs.add(pair_left[i] +" " + pair_right[i]);

            System.out.println(pairs.size());
        }
    }
}
