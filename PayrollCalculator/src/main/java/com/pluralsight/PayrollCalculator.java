package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = "";
        scanner.nextLine();

        System.out.println("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();


        System.out.println("Enter your pay rate: ");
        double payRate = scanner.nextDouble();


        double total = hoursWorked * payRate;
        if (hoursWorked > 40){
            total = (payRate * 1.5) * hoursWorked;
        }else {
            total = hoursWorked * payRate;
        }
        System.out.println("Your gross pay is: " + total);



        scanner.close();



    }
}
