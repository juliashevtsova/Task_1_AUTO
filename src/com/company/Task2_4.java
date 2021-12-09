package com.company;

import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input x:");
        int x = in.nextInt();
        System.out.print("Input n:");
        int n = in.nextInt();
        int answer = 1;

        for(int i=0; i<n; i++)
        {
            answer = answer *x;
        }
        System.out.println(answer);

    }
}
