package TaskForClass;

import java.util.Scanner;

public class Dog {
    String name;
    int age;
    String color;
    int energy;

    public void bark() {
        System.out.println("I want to walk");
    }

    public void respond() {
        if (this.name.equals("Sirius")) {
            System.out.println("This is me");
            bark();
            walk();
            feed();
            bark();
        } else {
            System.out.println("It isn`t me");
            System.out.println("There aren`t dogs with such name");
        }
    }

    public void feed () {
        while(this.energy <= 0)
        {
            System.out.println("I want to eat");
            energy++;
        }
    }
    public void walk () {
        while (this.energy > 0) {
            System.out.println("Walk!Walk!Walk!Walk!Walk!Walk!");
            energy--;
        }
    }


}
