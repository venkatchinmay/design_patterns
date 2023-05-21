package org.strategydesignpattern.withinterfaces;

/*
  @author: chinmay venkat
  Copy rights reserved,Don't use this code for your personal purposes, if we use give credits
 */

public class Baleno extends Car implements Engine, Fuel, Gear {

    @Override
    public void name() {
       System.out.println("Car name is Baleno");
    }

    @Override
    public void engine() {
        System.out.println("it has 4 stroke petrol engine");
    }

    @Override
    public void fuel() {
        System.out.println("it has petrol");
    }

    @Override
    public void isAutoGear() {
        System.out.println("it has auto gear");
    }
}
