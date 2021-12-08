package com.company;

import java.util.Scanner;

public class Task1_5 {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Введите номер месяца: ");
            int month = in.nextInt();

            switch (month) {
                case 1, 2, 12 -> System.out.print("Зима");
                case 3, 4, 5 -> System.out.print("Весна");
                case 6, 7, 8 -> System.out.print("Лето");
                case 9, 10, 11 -> System.out.print("Осень");
                default -> System.out.print("Нету такого месяца");
            }
        }
}



