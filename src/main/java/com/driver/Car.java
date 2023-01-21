package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

//    public Car()
//    {
//        super();
//
//    }
    public Car(String name, int wheels, int doors, boolean isManual, String type, int seats) {
        super();
        //Hint: Car extends Vehicle
        this.currentGear = 1;
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
        this.isManual = isManual;
        this.gears = gears;
        this.seats = seats;
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed , newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    public int getCurrentDirection()
    {
        return this.currentGear;
    }
}
