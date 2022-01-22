package com.company;

import java.util.Scanner;

public class Task3_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int[20];
        int temp;

        for( int i =0; i<array.length; i++)
        {
            array[i]=(int)Math.round((Math.random()* 1000));
            System.out.print(array[i] +" ");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("\nСортировка по убыванию\n");

        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}

