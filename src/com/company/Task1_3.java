package com.company;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;


public class Task1_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите number1:");
        int number1 = in.nextInt();
        System.out.print("Введите number2:");
        int number2 = in.nextInt();
        System.out.print("Введите number3:");
        int number3 = in.nextInt();
        System.out.print("Введите number4:");
        int number4 = in.nextInt();
        System.out.print("Введите number5:");
        int number5 = in.nextInt();

        int maximum = 0;
        int minimum = 0;

// очень хорошый способ, но без if
//        int minimum = min(min(min(number1, number2), min(number3, number4)),number5);
//        System.out.println("Min:"+ minimum);
//        int maximum = max(max(max(number1, number2), max(number3, number4)),number5);
//        System.out.println("Max:"+ maximum);


        if ((number1 <= number2) && (number1 <= number3) && (number1 <= number4) && (number1<=number5)) {
            System.out.println("Min:"+ number1);
        } else if ((number2 <= number1) && (number2 <= number3) && (number2 <= number4) && (number2<=number5)) {
            System.out.println("Min:"+ number2);
        } else if ((number3 <= number1) && (number3 <= number2) && (number3 <= number4)&& (number3<=number5)) {
            System.out.println("Min:"+ number3);
        } else if ((number4 <= number1) && (number4 <= number2) && (number4 <= number3) && (number4<=number5)) {
            System.out.println("Min:" + number4);
        }else
            {
                System.out.println("Min:"+ number5);
            }

        if ((number1 >= number2) && (number1 >= number3) && (number1 >= number4) && (number1>=number5)) {
            System.out.println("Max:"+ number1);
        } else if ((number2 >=number1) && (number2 >= number3) && (number2 >= number4) && (number2>=number5)) {
            System.out.println("Max:"+ number2);
        } else if ((number3 >= number1) && (number3 >= number2) && (number3 >= number4)&& (number3>=number5)) {
            System.out.println("Max:"+ number3);
        } else if ((number4 >= number1) && (number4 >= number2) && (number4 >= number3) && (number4>=number5)) {
            System.out.println("Max:" + number4);
        }else
        {
            System.out.println("Max:"+ number5);
        }
    }
}


