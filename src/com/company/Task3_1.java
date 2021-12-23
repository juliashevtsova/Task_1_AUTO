package com.company;

import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Task3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] array = new int [10];
        int i;

        for( i=0; i<10;i++){
            array[i] = 2*i+1;
            if(i<9){
                System.out.print(array[i] + ", ");
            }
            else
            {
                System.out.print(array[i] + ". ");
            }
        }
        //или же
//         for( i=0; i<10;i++){
//         array[i] = 2*i+1;
//         }
//        System.out.print(Arrays.toString(array));
    }
}
