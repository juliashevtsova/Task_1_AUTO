package com.company;

import java.util.Scanner;

public class Task3_4 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите размерность массива: ");
    int N = in.nextInt();
    int[] array = new int[N];
    int min = 0;
    int IDmin =0;
    int max =0;
    int IDmax =0;


    for( int i =0; i<N; i++)
    {
        System.out.print("Введите элемент array["+ i +"]: ");
        array[i]= in.nextInt();
    }

    for( int i = 0; i<N; i++)
    {
        if(i==0)
        {
            min = array[0];
        }
        else if(min>array[i])
        {
            min = array[i];
            IDmin = i;
        }
    }
    for( int i = 0; i<N; i++)
    {
        if(i==0)
        {
            max = array[0];
        }
        else if(max<array[i])
        {
            max = array[i];
            IDmax=i;
        }
    }
    int temp = array[IDmin];
    array[IDmin]=array[IDmax];
    array[IDmax]= temp;

    for( int i =0; i<N; i++)
    {
            System.out.print(array[i]+" ");

    }
}
}



