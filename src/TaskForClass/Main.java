package TaskForClass;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("What is the dog's name"); //answer "Sirius"
                Dog dog = new Dog();
                dog.name = in.nextLine();
                dog.color = "black";
                dog.age = 4;
                dog.energy = 4;

                dog.respond();


        }

}
