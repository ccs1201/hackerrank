package com.hackerrank.java.tests;

import java.util.Scanner;

public class Java1DArray_Part2 {

    static String gameSample = "4\n" +
            "5 3\n" +
            "0 0 0 0 0\n" +
            "6 5\n" +
            "0 0 0 1 1 1\n" +
            "6 3\n" +
            "0 0 1 1 1 0\n" +
            "3 1\n" +
            "0 1 0";

    public static boolean canWin(int leap, int[] game) {
        return isWinnable(leap, game, 0);
    }

    private static boolean isWinnable(int leap, int[] game, int lastPosition) {
        if (lastPosition < 0 || game[lastPosition] == 1) return false;
        if ((lastPosition == game.length - 1) || lastPosition + leap > game.length - 1) return true;
        
        game[lastPosition] = 1;

        return isWinnable(leap, game, lastPosition + 1) || isWinnable(leap, game, lastPosition - 1) || isWinnable(leap, game, lastPosition + leap);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(gameSample);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }

}
