package com.company;

import java.util.Scanner;

public class Task2_3_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input n:");
        int n = in.nextInt();
        int answer = 1;
        int i = 1;

        while (i <= n) {
            answer = answer * i;
            i++;
        }
        System.out.println(answer);
    }
}
