package com.company;

import java.util.Scanner;

public class Task3_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int N = in.nextInt();
        int[] array = new int[N];
        double sum = 0;

        for( int i =0; i<N; i++)
        {
            System.out.print("Введите элемент array["+ i +"]: ");
            array[i]= in.nextInt();
        }

        for (int i = 0; i < N; i++) {
            sum += array[i];
        }

        System.out.print("Cреднее арифметическое всех эллементов массива: " + sum/N);
    }

}
