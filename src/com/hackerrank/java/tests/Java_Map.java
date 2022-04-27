package com.hackerrank.java.tests;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java_Map {

    public static void main(String []argh)    {

        Map<String, Integer> phoneMap = new HashMap<>();

        Scanner in = new Scanner(sample);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            phoneMap.put(name, phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();

            search(s, phoneMap);

        }
    }

    private static void search(String s, Map<String, Integer> phones) {
        try {
            int phone = phones.get(s);
            System.out.println(s +"="+ phone);
        } catch (NullPointerException e){
            System.out.println("Not found");
        }
    }

    static String sample = "3\n" +
            "uncle sam\n" +
            "99912222\n" +
            "tom\n" +
            "11122222\n" +
            "harry\n" +
            "12299933\n" +
            "uncle sam\n" +
            "uncle tom\n" +
            "harry";
}
