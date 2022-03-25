package com.bootcamp.assignments.DayOne;

public class DayOne {

    byte byteVal = -127;
    char charVal = 'c';
    short shortVal = 65;
    int intVal = 5;
    long longVal = 25;
    float floatVal = 25.25F;
    double doubleVal = 43.47;
    boolean boolVal = true;

    public void printStandard() {
        System.out.println("Why Hello there - it works");


        String stringVal = ((Object) byteVal).getClass().getName();
        System.out.println(" string is " + stringVal);

        System.out.println(((Object) byteVal).getClass().getName() + " value is : " + byteVal);
        System.out.println("byte value is : " + byteVal);
        System.out.println("char value is : " + charVal);
        System.out.println("short value is : " + shortVal);
        System.out.println("int value is : " + intVal);
        System.out.println("long value is : " + longVal);
        System.out.println("float value is : " + floatVal);
        System.out.println("double value is : " + doubleVal);
        System.out.println("boolean value is : " + boolVal);

    }

    public void printTypes() {
        printMessage(charVal);
        printMessage(byteVal);
        printMessage(intVal);
        printMessage(shortVal);
        printMessage(longVal);
        printMessage(floatVal);
        printMessage(doubleVal);
        printMessage(boolVal);

    }
//autoboxing
    private void printMessage(Object object) {

        System.out.println(object.getClass().getName().substring(10) + " value is : " + object);

    }


}
