package com.hackerrank.java.tests;

public class Java_Loops_II {

    public static void main(String[] argh) {

        int a = 5;
        int b = 3;
        int n = 5;

        int pastResult = a;
        int multiplicador = 4;
        for (int j = 1; j <= n; j++) {

            if (j > 2) {
                pastResult += b * (multiplicador);
                multiplicador = (multiplicador * 2);

            } else {
                pastResult += b * (j);
            }

            System.out.print(" " + pastResult);
        }

        System.out.println();

    }

}

