package com.bootcamp.assignments.DayTwo;

import java.util.Scanner;

public class DayTwo {

    private Scanner input;


    public DayTwo() {

        input = new Scanner(System.in);

    }

    public void startAssignments() {
        firstAssigmnment();
        secondAssignment();
        thirdAssignment();
        fourthAssignment();
        fifthAssignment();
        sixthAssignment();
    }



    private void firstAssigmnment() {

        System.out.println("-----Assignment 1 starts: -----");
        System.out.println("Enter value a: ");
        int a = input.nextInt();

        System.out.println("Enter value b: ");
        int b = input.nextInt();

        System.out.println("is " + a + " equal to " + b + "? - " + (a == b));
        System.out.println("is " + a + " less than " + b + "? - " + (a < b));
        System.out.println("is " + a + " less or equal to " + b + "? - " + (a <= b));
        System.out.println("is " + a + " greater than " + b + "? - " + (a > b));
        System.out.println("is " + a + " greater or equal to " + b + "? - " + (a >= b));
    }


    private void secondAssignment() {
        System.out.println("-----Assignment 2 starts: compare two boolean values -----");

        System.out.println("Enter first boolean value: ");
        boolean b1 = input.nextBoolean();

        System.out.println("Enter second boolean value: ");
        boolean b2 = input.nextBoolean();

        System.out.println("is " + b1 + " and " + b2 + " equal? - " + (b1 == b2 ? true : false));


    }

    private void thirdAssignment() {

        System.out.println("-----Assignment 3 starts: check if number is whole-----");
        System.out.println("Enter whole number: ");
        int value = input.nextInt();

        System.out.println(value % 2 == 0 ? true : false);

    }

    private void fourthAssignment() {
        // false if it is a whole number - reverse result from third assignment.
        System.out.println("-----Assignment 4 starts: check if number is whole-----");
        System.out.println("Enter whole number: ");
        int value = input.nextInt();

        System.out.println(value % 2 != 0 ? true : false);



    }

    private void fifthAssignment() {
        System.out.println("-----Assignment 5 starts: get contrary boolean value-----");
        System.out.println("Enter boolean value: ");
        boolean inputBool = input.nextBoolean();

        System.out.println("Opposite of " + inputBool + " is " + !inputBool);

    }

    private void sixthAssignment () {
        System.out.println("-----Assignment 6 starts: use only whole numbers-----");
        System.out.println("Enter number a: ");
        int a = input.nextInt();

        System.out.println("Enter number b: ");
        int b = input.nextInt();

        System.out.println((a == b || (a < 0 && b >0) || (a > 1001 && b > 1001)) ? true : false);

    }






}
