package com.bootcamp.assignments.DayThree;

import java.util.List;

public class Vehicle {

    protected final int maxSpeed;
    protected int weight;
    protected int currentSpeed;
    protected final List<String> directions;
    protected String currentDirection;

    public Vehicle(int maxSpeed, int weight, List<String> directions) {
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.directions = directions;
        this.currentSpeed = 0;
        this.currentDirection = "";
    }




}
