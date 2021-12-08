package com.company;

import java.util.Scanner;

public class Task1_2 {
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

//        int maximum = 0;
//        int number1 = 5;
//        int number2 = 9;
//        int number3 = 3;
//        int number4 = 9;

        if (number1 == number2 && number1 == number3 && number1 == number4) {
            System.out.println("Количество максимальных чисел: " + 4);
        }
        if (((number1 == number2) && (number1 == number3) && (number1 != number4)) ||
                ((number1 == number2) && (number1 != number3) && (number1 == number4)) ||
                ((number1 != number2) && (number1 == number3) && (number1 == number4)) ||
                ((number2 == number3) && (number2 == number4) && (number2 != number1))) {
            if ((number1 > number4) || (number1 > number3) || (number2 > number1)) {
                System.out.println("Количество максимальных чисел: " + 3);
            } else {
                System.out.println("Количество максимальных чисел:" + 1);
            }
        }
        if (((number1 == number2) && (number1 != number4) && (number3 == number4)) ||
                ((number1 == number3) && (number1 != number2) && (number2 == number4)) ||
                (number1 == number4) && (number1 != number2) && (number2 == number3)) {
            System.out.println("Количество максимальных чисел: " + 2);

        }
        if (((number1 == number2) && (number1 != number3) && (number1 != number4) && (number3 != number4)) ||
                ((number1 == number3) && (number1 != number4) && (number1 != number2) && (number2 != number4)) ||
                ((number1 == number4) && (number1 != number3) && (number1 != number2) && (number2 != number3)) ||
                (number2 == number3) && (number2 != number4) && (number1 != number2) && (number1 != number4)) {
            if (((number1 > number4) && (number1 > number3))
                    || ((number1 > number4) && (number1 > number2))
                    || ((number1 > number3) && (number1 > number2) && (number2 != number3))
                    || ((number2 > number4) && (number2 > number1) && (number1 != number4))) {
                System.out.println("Количество максимальных чисел: " + 2);
            } else {
                System.out.println("Количество максимальных чисел:" + 1);
            }
        }
        if (((number1 != number2) && (number1 != number3) && (number1 != number4) && (number2 != number3) && (number2 != number4) && (number3 != number4))) {
            System.out.println("Количество максимальных чисел:" + 1);
        }
    }
}
//способ проще
//        if (number1 >= number2 && number1 >= number3 && number1 >= number4)
//        {
//            maximum++;
//        }
//
//        if (number2 >= number1 && number2 >= number3 && number2 >= number4)
//        {
//            maximum++;
//        }
//
//        if (number3 >= number1 && number3 >= number2 && number3 >= number4)
//        {
//            maximum++;
//        }
//
//        if (number4 >= number1 && number4 >= number2 && number4 >= number3)
//        {
//            maximum++;
//        }
//        System.out.println("Количество максимальных чисел " + maximum);


