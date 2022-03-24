package com.bootcamp.assignments.DayThree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DayThree {


    public void fifthAssignment() {

        System.out.println("----- car assignment starts ------");

        List<String> directions = new ArrayList<>(Arrays.asList("forward", "backwards", "left", "right"));
        Car lada = new Lada(180, 500, directions, 6, 4, "Vesta" );
        System.out.println(lada.toString());
        lada.startDriving("forward");
        lada.increaseSpeed();
        lada.increaseSpeed();
        System.out.println(lada.toString());
        lada.increaseSpeed();
        lada.increaseSpeed();
        lada.increaseSpeed();
        lada.increaseSpeed();
        System.out.println(lada.toString());
        lada.increaseSpeed();
        lada.increaseSpeed();
        lada.increaseSpeed();
        lada.steer("left");
        lada.steer("left-right");
        lada.increaseSpeed();
        lada.increaseSpeed();
        lada.decreaseSpeed();
        lada.decreaseSpeed();
        lada.decreaseSpeed();
        lada.decreaseSpeed();
        lada.decreaseSpeed();
        lada.decreaseSpeed();
        lada.decreaseSpeed();
        lada.decreaseSpeed();
        lada.decreaseSpeed();
        lada.decreaseSpeed();





    }


    public void thirdFourthAssignment() {

        System.out.println("------ third fourth assignment starts ------");
        BankAccount firstAccount = new BankAccount(1000, "ERNESTAS", "KAZ");
        BankAccount secondAccount = new BankAccount(2000, "SOMEONE", "ELSE");
        //successful tests
        firstAccount.printBalance();
        firstAccount.deposit(500);
        firstAccount.printBalance();
        firstAccount.withdraw(25);
        firstAccount.printBalance();
        //unsuccessful withdraw
        firstAccount.withdraw(1501);
        System.out.println(firstAccount.toString());
        //unsuccessful transfer
        firstAccount.transferBalance(secondAccount, 1501);
        System.out.println(firstAccount.toString());
        System.out.println(secondAccount.toString());
        //unsuccessful deposit
        firstAccount.deposit(7000);
        //successful transfer
        firstAccount.transferBalance(secondAccount, 76);
        System.out.println(firstAccount.toString());
        System.out.println(secondAccount.toString());

    }



    public void secondAssignment() {

        System.out.println("------ second assignment starts ------");
        //declare and initialize four arbitrary whole numbers;
        int [] array = new int[] {1,2,3,4};
        //copy array by itterating it;

        Random random = new Random();
        for (int i = 0; i < array.length; i ++) {

        }

        int [] newArray = new int[4];

        for (int i = 0; i< array.length; i++) {
            newArray[i] = array[i];
        }

        for (int number: newArray) {
            System.out.println("Array value is " + number);

        }


    }

    public int[][] firstAssignment () {

        System.out.println("------ first assignment starts ------");
        int tableRow = 10;
        int tableCollumn = 10;

        int [][]table = new int[tableRow][tableCollumn];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j< table[i].length; j++) {
                table[i][j] = (i+1)*(j+1);


                System.out.println(" "+(i + 1)+" * "+(j + 1)+" = "+table[i][j]);



            }
        }
        return table;

    }


}
