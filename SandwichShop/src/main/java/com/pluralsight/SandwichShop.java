package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What size sandwich would you like, regular or large?: ");
        scanner.nextLine();
        String regular = "$5.45";
        String large = "$8.95";

        int age = scanner.nextInt();
        System.out.println("How old are you?: ");
        scanner.nextLine();
        if(age <= 17){
            System.out.println("You receive a 10% discount!");
        } else if (age >= 65) {
            System.out.println("You receive a 20% discount!");
        }else {
            System.out.println("You do not qualify for a discount.");
        }

    scanner.close;
    }
}
