package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by Alina on 29.10.2015.
 */
public class Plane implements Flyable {
    private int numberPassengers;

    public Plane(int numberPassengers){
      this.numberPassengers = numberPassengers;
    }
    @Override
    public void fly() {

    }
}
