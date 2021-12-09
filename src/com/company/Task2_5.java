package com.company;

import java.util.Scanner;

public class Task2_5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = 0;

        int i = 0;

        while (i > -6) {
            System.out.println(x);
            x = x-5;

            if (x ==-100)
            {
                 break;
            }
            i++;
        }
    }
}
