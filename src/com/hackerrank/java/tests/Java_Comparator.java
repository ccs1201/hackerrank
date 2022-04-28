package com.hackerrank.java.tests;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Java_Comparator {


}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class SolutionComparator {

    public static void main(String[] args) {

        String sample = "5\n" +
                "amy 100\n" +
                "david 100\n" +
                "heraldo 50\n" +
                "aakansha 75\n" +
                "aleksa 150";

        Scanner scan = new Scanner(sample);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }

    private static class Checker implements Comparator<Player> {


        @Override
        public int compare(Player p1, Player p2) {

            if (p1.score == p2.score) {
                return p1.name.compareTo(p2.name);
            } else {
                return p2.score - p1.score;
            }

        }
    }
}