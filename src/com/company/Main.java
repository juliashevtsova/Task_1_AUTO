package com.company;
import java.util.Scanner;
import static java.lang.Math.min;

public class Main {

    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);

        System.out.print("Input a number 1: ");
        int number1 = in.nextInt();

        System.out.print("Input a number 2: ");
        int number2 = in.nextInt();

        System.out.print("Input a number 3: ");
        int number3 = in.nextInt();

        System.out.print("Input a number 4: ");
        int number4 = in.nextInt();

//        int answer = min(min(number1, number2), min(number3, number4));
//        System.out.println("Min:"+ answer);
//        in.close();                                                       другой способ

        if ((number1 <= number2) && (number1 <= number3) && (number1 <= number4)) {
            System.out.println("Min:"+ number1);
        } else if ((number2 <= number1) && (number2 <= number3) && (number2 <= number4)) {
            System.out.println("Min:"+ number2);
        } else if ((number3 <= number1) && (number3 <= number2) && (number3 <= number4)) {
            System.out.println("Min:"+ number3);
        } else {
            System.out.println("Min:"+ number4);
        }
    }
}
