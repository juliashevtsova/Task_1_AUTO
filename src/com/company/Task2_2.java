package com.company;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input n:");
        int n = in.nextInt();
        int answer = 1;

        for (int i = 1; i <= n; i++)
        {
            answer = answer * i;
        }

        System.out.println(answer);
    }
}



