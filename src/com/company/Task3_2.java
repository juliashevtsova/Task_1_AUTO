package com.company;

import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int N = in.nextInt();
        int[] array = new int[N];
        int resultArray = 0;

        for( int i =0; i<N; i++)
        {
            System.out.print("Введите элемент array[" + i +"]: ");
            array[i]= in.nextInt();
        }

        for( int i = 0; i<N; i++)
        {
            if(i==0)
            {
                resultArray = array[0];
            }
            else if(resultArray>array[i])
            {
                resultArray = array[i];
            }
            else if (resultArray < array[i])
            {
               break;
            }
        }

        for( int i =0; i<N; i++)
        {
            if(resultArray==array[i])
            {
                System.out.println("Минимальное число array["+ i +"]: " + array[i]);
            }
        }
    }
}
