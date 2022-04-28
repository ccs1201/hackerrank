package com.hackerrank.java.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_Stack {

    private static final String sample = "[][{}({})]\n" + "({{}}){}\n" + "{{}]\n" + "{}[](]";

    public static void main(String[] args) {
        Scanner sc = new Scanner(sample);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(test(input));
        }
    }

    private static boolean test(String s) {

        List<Character> listChars = stringToList(s);

        if (s.length() % 2 > 0) {
            return false;
        }

        return check(listChars);
    }

    private static List<Character> stringToList(String s) {

        List<Character> list = new ArrayList<>();
        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            list.add(aChar);
        }
        return list;
    }

    private static boolean check(List<Character> charactersToCompare) {

        while (compare(charactersToCompare)) {
            if (charactersToCompare.isEmpty()) {
                break;
            }
        }

        return charactersToCompare.isEmpty();
    }

    private static boolean compare(List<Character> charactersToCompare) {
        Character inverted = invert(charactersToCompare.get(0));
        charactersToCompare.remove(0);

        for (int i = 0; i < charactersToCompare.size(); i++) {
            Character nextChar = charactersToCompare.get(i);
            if (inverted.equals(nextChar)) {
                charactersToCompare.remove(i);
                return true;
            }
        }
        return false;
    }

    private static Character invert(Character c) {

        if (c.equals('{')) {
            return '}';
        } else if (c.equals('(')) {
            return ')';
        } else {
            return ']';
        }
    }
}

