package com.hackerrank.java.tests;

import java.util.Scanner;

public class Java_Static_Initializer_Block {

    static int B;
    static int H;
    static boolean flag = true;

    static{

        Scanner in  = new Scanner(System.in);

        B =  in.nextInt();
        in.nextLine();
        H = in.nextInt();
        in.close();

        if(B < 1 || H < 1){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be                   positive");

        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}
