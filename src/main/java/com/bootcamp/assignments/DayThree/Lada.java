package com.bootcamp.assignments.DayThree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lada extends Car{
    protected String model;


    public Lada(int maxSpeed, int weight, List<String> directions, int numberOfGears, int numberOfWheels, String model) {
        super(maxSpeed, weight, directions, numberOfGears, numberOfWheels);
        this.model = model;
    }


    @Override
    public String toString() {
        return "Lada{" +
                "numberOfGears=" + numberOfGears +
                ", currentGear=" + currentGear +
                ", numberOfWheels=" + numberOfWheels +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", currentSpeed=" + currentSpeed +
                ", directions=" + directions +
                ", currentDirection='" + currentDirection + '\'' +
                '}';
    }
}
