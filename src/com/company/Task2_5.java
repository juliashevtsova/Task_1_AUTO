package com.company;

import java.util.Scanner;

public class Task2_5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = 0;

        for(int i=0; i<10; i++)
        {
            System.out.println(x);
            x = x-5;
        }
    }
}
