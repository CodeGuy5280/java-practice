package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
// declare variables here
// then code solution
// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
// REPEAT FOR NEXT EXERCISE

        //Salary
        int bobSalary = 50000;
        int gregSalary = 35000;
        int highestSalary = Math.max(gregSalary, bobSalary);
        System.out.println("The highest salary is: " + highestSalary);

        //Vehicle price
        int carPrice = 65000;
        int truckPrice = 80000;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price vehicle is: " + lowestPrice);

        //Area of a circle pi r2
        double pi = 3.14;
        double radius = 7.25;
        double area = pi + radius * radius;
        System.out.println("The area of the circle is: " + area);


        //Average
        double highNum = 50;
        double lowNum = 25;
        double choiceNum = (highNum + lowNum) / 2;
        System.out.println("The chosen number is: " + choiceNum);



    }
}

