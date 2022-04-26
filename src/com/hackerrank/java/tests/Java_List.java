package com.hackerrank.java.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_List {

    static String sample = "5\n" + "12 0 1 78 12\n" + "2\n" + "Insert\n" + "5 23\n" + "Delete\n" + "0";
    static List<Integer> anArray;

    public static void main(String[] args) {

        Scanner in = new Scanner(sample);

        int initialSize = in.nextInt();
        in.nextLine();

        anArray = new ArrayList<>(initialSize);

        anArray.forEach(integer -> {
            while (in.hasNextInt()) {
                anArray.add(in.nextInt());
            }
            in.nextLine();
        });

        while (in.hasNext()) {

            if (in.hasNext("Insert")) {

                while (in.hasNextInt()) {
                    int index = in.nextInt();
                    int value = in.nextInt();
                    add(index, value);
                    in.nextLine();
                }
            }

            if (in.hasNext("Delete")) {
                delete(in.nextInt());
                in.nextLine();
            }
        }

        print();

    }


    static void delete(int index) {
        anArray.remove(index);
    }

    static void add(int index, int value) {
        anArray.add(index, value);
    }

    static void print() {

        anArray.forEach(value -> {
            System.out.println(value + " ");
        });
    }
}
