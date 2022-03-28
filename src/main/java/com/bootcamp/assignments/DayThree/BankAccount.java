package com.bootcamp.assignments.DayThree;

public class BankAccount {

    private double balance;
    private String firstName;
    private String lastName;
    private double maximumToDeposit = 5000;

    public BankAccount() {

    }


    public BankAccount(double balance, String firstName, String lastName) {
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }


//does work without try catch statement and no method signature for throw Illegal
//    public void deposit(double amount)  {
//
//        try{
//            if (amount > maximumToDeposit) {
//                throw new IllegalArgumentException(  "Transaction cancelled. Max deposit - " + maximumToDeposit + " | " + " Your deposit: " + amount);
//            } else {
//
//                this.balance += amount;
//                System.out.println("deposit of " + amount + " was successful");
//            }
//
//        } catch (IllegalArgumentException ex){
//            System.out.println(ex);
//
//        }
//
//    }

    public void deposit(double amount) throws IllegalArgumentException {

            if (amount > maximumToDeposit) {
                throw new IllegalArgumentException(  "Transaction cancelled. Max deposit - " + maximumToDeposit + " | " + " Your deposit: " + amount);
            } else {

                this.balance += amount;
                System.out.println("deposit of " + amount + " was successful");
            }



    }

    public void withdraw(double amount) {
        try {
            if (amount > this.balance) {
                throw new IllegalArgumentException("There is not enough funds.");
            } else {
                this.balance -= amount;
                System.out.println("withdrawal of " + amount + " was successful");
            }

        } catch (IllegalArgumentException ex) {
            System.out.println(ex);

        }
    }

    public void printBalance() {
        System.out.println("Your current balance is : " + this.balance);
    }

    public double getBalance() {
        return this.balance;

    }

    public double getMaximumToDeposit() {
        return this.maximumToDeposit;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " current account balance is : " + this.balance;

    }

    public void transferBalance(BankAccount transferToAccount, double amount) {

        try {
            if (amount > this.balance) {
                throw new IllegalArgumentException( "Transfer cancelled. You are trying to transfer " +  amount + " units, but only " + this.balance + " are available.");
            } else {
                this.withdraw(amount);
                transferToAccount.deposit(amount);
                System.out.println("Transfer successful from account " + this.firstName + " " + this.lastName + " to account " + transferToAccount.firstName + " " + transferToAccount.lastName);
                System.out.println("Amount transfered : " + amount);
            }

        } catch (IllegalArgumentException ex) {
            System.out.println(ex);

        }

    }


    }




