package com.hackerrank.java.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_List {
    public static void main(String[] args) {
        List<Integer> anArray = new ArrayList<>();

        Scanner in = new Scanner(sample);

        int membersSize = in.nextInt();


        for (int i = 0; i < membersSize; i++) {
            anArray.add(in.nextInt());
        }

        int querySize = in.nextInt();

        for (int i = 0; i < querySize; i++) {
            in.nextLine();
            if (in.hasNext("Insert")) {
                in.nextLine();
                while (in.hasNextInt()) {
                    int index = in.nextInt();
                    int value = in.nextInt();
                    anArray.add(index, value);
                }
            } else { //Delete
                in.nextLine();
                anArray.remove(in.nextInt());

            }

        }

        in.close();
        print(anArray);

    }

    static void print(List<Integer> list) {

        list.forEach(value -> {
            System.out.print(value + " ");
        });
    }

    static String sample ="50\n" +
            "75192 14885 71431 34461 61231 21558 55622 36011 39791 94414 37813 30293 64822 11691 19285 98683 8562 6953 82718 63941 69534 35738 45068 95556 11046 85063 30936 11640 56380 65304 87804 60980 38266 10904 43475 26649 92856 90700 54044 2437 88357 17442 73368 39722 15320 14133 47254 69024 5565 95080\n" +
            "100\n" +
            "Insert\n" +
            "44 30237\n" +
            "Insert\n" +
            "34 57126\n" +
            "Insert\n" +
            "33 5418\n" +
            "Insert\n" +
            "30 66954\n" +
            "Delete\n" +
            "13\n" +
            "Insert\n" +
            "4 38588\n" +
            "Insert\n" +
            "38 28360\n" +
            "Insert\n" +
            "24 23895\n" +
            "Insert\n" +
            "11 17252\n" +
            "Insert\n" +
            "11 71596\n" +
            "Insert\n" +
            "40 14091\n" +
            "Insert\n" +
            "35 4795\n" +
            "Insert\n" +
            "7 17464\n" +
            "Insert\n" +
            "53 86360\n" +
            "Delete\n" +
            "14\n" +
            "Insert\n" +
            "46 34128\n" +
            "Insert\n" +
            "28 51603\n" +
            "Insert\n" +
            "28 8849\n" +
            "Insert\n" +
            "19 6186\n" +
            "Insert\n" +
            "19 98707\n" +
            "Insert\n" +
            "61 16274\n" +
            "Delete\n" +
            "24\n" +
            "Insert\n" +
            "39 97288\n" +
            "Delete\n" +
            "52\n" +
            "Delete\n" +
            "63\n" +
            "Insert\n" +
            "6 81894\n" +
            "Insert\n" +
            "47 49553\n" +
            "Insert\n" +
            "41 35054\n" +
            "Delete\n" +
            "64\n" +
            "Delete\n" +
            "9\n" +
            "Delete\n" +
            "14\n" +
            "Insert\n" +
            "14 59312\n" +
            "Delete\n" +
            "57\n" +
            "Delete\n" +
            "23\n" +
            "Delete\n" +
            "0\n" +
            "Insert\n" +
            "24 80902\n" +
            "Delete\n" +
            "29\n" +
            "Insert\n" +
            "27 62978\n" +
            "Delete\n" +
            "50\n" +
            "Delete\n" +
            "9\n" +
            "Delete\n" +
            "51\n" +
            "Delete\n" +
            "31\n" +
            "Delete\n" +
            "30\n" +
            "Delete\n" +
            "53\n" +
            "Delete\n" +
            "18\n" +
            "Insert\n" +
            "54 91123\n" +
            "Delete\n" +
            "48\n" +
            "Delete\n" +
            "3\n" +
            "Delete\n" +
            "32\n" +
            "Delete\n" +
            "21\n" +
            "Insert\n" +
            "22 23587\n" +
            "Delete\n" +
            "43\n" +
            "Delete\n" +
            "7\n" +
            "Delete\n" +
            "38\n" +
            "Delete\n" +
            "31\n" +
            "Delete\n" +
            "20\n" +
            "Delete\n" +
            "41\n" +
            "Insert\n" +
            "29 76024\n" +
            "Insert\n" +
            "48 64945\n" +
            "Insert\n" +
            "15 64814\n" +
            "Delete\n" +
            "51\n" +
            "Delete\n" +
            "46\n" +
            "Delete\n" +
            "46\n" +
            "Delete\n" +
            "37\n" +
            "Insert\n" +
            "40 35367\n" +
            "Delete\n" +
            "42\n" +
            "Insert\n" +
            "0 51387\n" +
            "Insert\n" +
            "36 82795\n" +
            "Insert\n" +
            "46 67350\n" +
            "Delete\n" +
            "49\n" +
            "Delete\n" +
            "1\n" +
            "Insert\n" +
            "26 89312\n" +
            "Delete\n" +
            "20\n" +
            "Insert\n" +
            "46 82353\n" +
            "Delete\n" +
            "7\n" +
            "Insert\n" +
            "45 37176\n" +
            "Delete\n" +
            "48\n" +
            "Delete\n" +
            "37\n" +
            "Delete\n" +
            "41\n" +
            "Insert\n" +
            "34 31705\n" +
            "Delete\n" +
            "5\n" +
            "Insert\n" +
            "21 63912\n" +
            "Insert\n" +
            "14 73658\n" +
            "Delete\n" +
            "39\n" +
            "Insert\n" +
            "46 13825\n" +
            "Delete\n" +
            "11\n" +
            "Delete\n" +
            "10\n" +
            "Insert\n" +
            "20 7286\n" +
            "Delete\n" +
            "0\n" +
            "Delete\n" +
            "36\n" +
            "Insert\n" +
            "17 78144\n" +
            "Delete\n" +
            "27\n" +
            "Delete\n" +
            "12\n" +
            "Delete\n" +
            "10\n" +
            "Insert\n" +
            "23 6220\n" +
            "Insert\n" +
            "24 55859\n" +
            "Delete\n" +
            "29\n" +
            "Delete\n" +
            "9\n" +
            "Insert\n" +
            "29 56901\n" +
            "Insert\n" +
            "18 10362\n";

}