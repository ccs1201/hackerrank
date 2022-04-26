package com.hackerrank.java.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_Arraylist {

    public static void main(String[] args) {

        String imput = "5\n" +
                "5 41 77 74 22 44\n" +
                "1 12\n" +
                "4 37 34 36 52\n" +
                "0\n" +
                "3 20 22 33\n" +
                "5\n" +
                "1 3\n" +
                "3 4\n" +
                "3 1\n" +
                "4 3\n" +
                "5 5";

        Scanner in = new Scanner(imput);
        int lines = in.nextInt();
        in.nextLine();
        int line = 0;

        List<Row> rows = new ArrayList<>();
        List<Query> queries = new ArrayList<>();

        while (line < lines) {

            String dataRead = in.nextLine();
            Row row = new Row();
            rows.add(row);
            Scanner sc = new Scanner(dataRead);
            /*
            Ignore first integer, that's represents
            the quantity of members in this line. Not needed
            because we are using hasNextInt() to read line.
            */
            sc.nextInt();

            while (sc.hasNextInt()) {
                row.add(sc.nextInt());
            }
            line++;
        }

        line = 0;
        lines = in.nextInt();
        in.nextLine();

        while (line < lines) {
            String dataRead = in.nextLine();
            Query query = new Query();
            queries.add(query);
            Scanner sc = new Scanner(dataRead);

            while (sc.hasNextInt()) {
                query.setRow(sc.nextInt());
                query.setColumn(sc.nextInt());
            }
            line++;

        }

        in.close();

        queries.forEach(q -> {
            try {
                Row row = rows.get(q.getRow());
                int result = row.getValueAt(q.getColumn());

                System.out.println(result);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        });

    }
}

class Row {

    private List<Integer> columns = new ArrayList<>();

    public void add(Integer value) {
        columns.add(value);
    }

    public Integer getValueAt(int index) {
        return columns.get(index);
    }

}

class Query {

    private int row;
    private int column;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row-1;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column-1;
    }
}



