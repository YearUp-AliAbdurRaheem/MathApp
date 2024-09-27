package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        // declare variables here
        int bobSalary = 2_400;
        int garySalary = 330_000;
        // then code solution
        int highestSalary = Math.max(bobSalary, garySalary);
        // then use System.out.println() to display results
        System.out.println("The highest salary is " + highestSalary);
        // ex: System.out.println("The answer is " + answer);

        // Question 2:
        // declare variables here
        int carPrice = 150_00;
        int truckPrice = 6_000;
        // then code solution
        System.out.println("The cheaper one is " + Math.min(carPrice, truckPrice));

        // Question 3:
        // declare variables here
        float radius = 7.25f;
        // then code solution
        System.out.println("The area of a circle whos radius is " + radius + " is " + (radius * radius * Math.PI));

        // Question 4:
        // declare variables here
        float num1 = 5.0f;
        // then code solution
        System.out.println("The square root of " + num1 + " is " + Math.sqrt(num1));

        // Question 5:
        // declare variables here
        double x1 = 5, y1 = 10;
        double x2 = 85, y2 = 50;
        // then code solution
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        // then use System.out.println() to display results
        System.out.println("The distance between the points (5, 10) and (85, 50) is " + distance);

        // Question 6:
        // declare variables here
        float num2 = -3.8f;
        // then code solution
        System.out.println("The absolute value of " + num2 + " is " + Math.abs(num2));
        // Question 7:
        System.out.println("A random number between 0 and 1 is " + Math.random());


    }
}
// Question 1:
// declare variables here

// then code solution

// then use System.out.println() to display results