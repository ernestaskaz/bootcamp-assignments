package com.bootcamp.assignments.DayThree;

import java.awt.*;
import java.util.List;

public class Car extends Vehicle {

    protected int numberOfGears;
    protected int currentGear;
    protected int numberOfWheels;

    public Car(int maxSpeed, int weight, List<String> directions, int numberOfGears, int numberOfWheels) {
        super(maxSpeed, weight, directions);
        this.numberOfWheels = numberOfWheels;
        this.numberOfGears = numberOfGears;
        setCurrentGear(0);
    }

    protected void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }


    protected int getNumberOfGears()  {
        return numberOfGears;
    }

    protected void increaseGear() {
        if (currentGear < getNumberOfGears()) {
            currentGear++;
        }

    }
    protected void decreaseGear() {
        if (currentGear > 0) {
            currentGear--;
        }
    }

    protected void increaseSpeed() {
        if (currentSpeed < maxSpeed) {
            this.currentSpeed += 20;
            increaseGear();
        } else {
            System.out.println("maximum speed reached");
        }

    }

    protected void decreaseSpeed() {
        if (currentSpeed > 0) {
            this.currentSpeed -= 20;
            decreaseGear();
        }else {
            System.out.println("You have stopped");
        }

    }

    protected void steer(String direction) {
        if (directions.contains(direction)) {
            this.currentDirection = direction;
        } else {
            System.out.println("No such direction");
        }
    }

    protected void startDriving(String direction) {
        steer(direction);
        increaseSpeed();
    }





}
