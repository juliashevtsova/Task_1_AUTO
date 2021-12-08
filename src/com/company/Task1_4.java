package com.company;

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите name1:");
        String name1 = in.nextLine();
        System.out.print("Введите name2:");
        String name2 = in.nextLine();
         int answer = name1.compareTo(name2);

        if(answer == 0)
        {
            System.out.print(name1+ " и " + name2 +" - тезки");

        }
        else {
            System.out.print(name1+ " и " + name2 + " разные имена" );
        }

    }
}
