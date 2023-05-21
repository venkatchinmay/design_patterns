package org.strategydesignpattern.implementautogear;
/*
  @author: chinmay venkat
  Copy rights reserved,Don't use this code for your personal purposes, if we use give credits
 */
public abstract class Car {

    public abstract void name();

    public void fuel() {
        System.out.println("Fuel used is petrol");
    }

    public void engine(){
        System.out.println("we are using the 4 stroke petrol engine");
    }

    public void tyres(){
        System.out.println("Car had apollo tyres");
    }

    public void headLamps(){
        System.out.println("we are using head lamps");
    }

    public void isAutoGear(){
        System.out.println("implemented auto gear ....");
    }

}
